package v65;

import java.util.List;

public class RecordType {

    public static void main(String[] args) {
        Person zoltan = new Person("Zoltán", 38);

        System.out.println(zoltan);
        System.out.println("A nevem: " + zoltan.name());
        Person zoltan2 = new Person("Zoltán", 22);

        System.out.println(zoltan.equals(zoltan2));

        System.out.println(zoltan.getClass().getSuperclass());

        record Pair(String a, String b) {}
        Pair pair = new Pair("alma", "körte");
        System.out.println(pair);

        System.out.println(valami());
    }

    private static List<Object> valami() {
        record Pair(String a, String b) {}
        Pair pair = new Pair("alma", "körte");
        System.out.println(pair);
        return List.of(pair);
    }
}
