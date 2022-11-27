package v118;

import java.util.Random;
import java.util.StringJoiner;

public class SynchronizationProblem {

    public static void main(String[] args) throws InterruptedException {
        int numberOfTests = 20;
        int numberOfZeroResults = 0;
        for (int i = 0; i < numberOfTests; i++) {
            int result = decrementToZero();
            if (result == 0) {
                numberOfZeroResults++;
            }
        }
        System.out.printf("%d / %d helyes eredmény%n", numberOfZeroResults, numberOfTests);
    }

    private static int decrementToZero() throws InterruptedException {
        Counter counter = new Counter(10);

        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(decrement(counter));
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println(counter);
        return counter.getValue();
    }

    private static Runnable decrement(Counter counter) {
        return () -> {
//            int newValue = counter.getValue() - 1;
//            counter.setValue(newValue);
            counter.decrement();

            try {
                Thread.sleep(new Random().nextInt(20));
            } catch (InterruptedException ignored) {}

//            newValue = counter.getValue() - 1;
//            counter.setValue(newValue);
            counter.decrement();

        };
    }

    private static class Counter {
        private int value;

        public Counter(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public synchronized void decrement() {
            // value = value - 1;
            value--;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Counter.class.getSimpleName() + "[", "]")
                    .add("value=" + value)
                    .toString();
        }
    }
}
