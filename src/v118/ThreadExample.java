package v118;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntSupplier;
import java.util.stream.Stream;

public class ThreadExample {

    public static void main(String[] args) {

        int[] numbers = generateNumbers(100000);
        execute(() -> serialSum(numbers), "Soros végrehajtás");
        execute(() -> parallelSum(numbers), "Párhuzamos végrehajtás");
        execute(() -> parallelStreamSum(numbers), "Párhuzamos stream végrehajtás");
    }

    private static int serialSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    private static int parallelSum(int[] numbers) {
        int numberOfThreads = 5;
        int chunkSize = numbers.length / numberOfThreads;
        Thread[] threads = new Thread[numberOfThreads];
        AtomicInteger result = new AtomicInteger(0);

        // inicializálás
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(new Worker(result, numbers, i * chunkSize, chunkSize));
        }

        // indítás
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].start();
        }

        // Várakozás a végrehajtás befejezésére
        try {
            for (int i = 0; i < numberOfThreads; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return result.get();
    }

    private static int parallelStreamSum(int[] numbers) {
        return Arrays.stream(numbers).parallel().sum();
    }

    private static class Worker implements Runnable {
        private final AtomicInteger accumulator;
        private final int[] numbers;
        private final int start, length;

        private Worker(AtomicInteger accumulator, int[] numbers, int start, int length) {
            this.accumulator = accumulator;
            this.numbers = numbers;
            this.start = start;
            this.length = length;
        }

        @Override
        public void run() {
            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum += numbers[start + i];
            }
            accumulator.addAndGet(sum);
        }
    }

    private static void execute(IntSupplier calculation, String message) {
        long start = System.currentTimeMillis();
        int result = calculation.getAsInt();
        long end = System.currentTimeMillis();
        System.out.println(message);
        System.out.println("Eredmény: " + result);
        System.out.println("Végrehajtási idő: " + (end - start) + "ms");
    }

    private static int[] generateNumbers(int size) {
        Random random = new Random();
        return Stream.generate(() -> random.nextInt(100))
                .limit(size)
                .mapToInt(n -> n)
                .toArray();
    }

}
