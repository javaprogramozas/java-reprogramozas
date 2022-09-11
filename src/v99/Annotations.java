package v99;

import java.util.List;

public class Annotations implements Runnable {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List numbers = List.of("one", "two", "three");
        thisIsSomeOldCode(numbers);
    }

    @Override
    public void run() {
        System.out.println("Run, run, run...");
    }

    @Deprecated
    public static void thisIsSomeOldCode(List values) {
        for (int i = 0; i < values.size(); i++) {
            System.out.printf("%d. %s%n", i, values.get(i));
        }
    }
}
