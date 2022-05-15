package v66;

public class AutoBoxing {

    public static void main(String[] args) {
        // Primitív típusú változók
        int age = 22;
        boolean selected = true;
        char enter = '\n';

        // Csomagoló osztályok
        Integer count = 5;
        Boolean initialized = false;
        Character a = 'A';

        System.out.println("Count = " + count);
        System.out.println("Init = " + initialized);
        System.out.println("a = " + a);
        System.out.println();

        // Objektumok -> metódusok
        System.out.println("Is count = max? " + count.equals(Integer.MAX_VALUE));
        System.out.println("FALSE.compareTo(TRUE) = " + initialized.compareTo(Boolean.TRUE));
        System.out.println();

        // Autoboxing & unboxing
        count = age;
        selected = initialized;
        long result = square(2L);
        System.out.println("Count = " + count);
        System.out.println("Init = " + initialized);
        System.out.println("2^2 = " + result);

        ValueHolder holder = new ValueHolder();
        holder.setValue("macska");
        boolean hasValue = holder.hasValue();

        holder.setValue(5);
        System.out.println(holder.getValue() + " -> " +holder.getValue().getClass());
    }

    private static Long square(Long number) {
        return number * number;
    }

}
