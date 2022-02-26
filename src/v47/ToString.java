package v47;

public class ToString {

    public static void main(String[] args) {
        int age = 25;
        Person armstrong = new Person("Neil Armstrong", "astronaut",1930);
        Person hawking = new Person("Stephen Hawking", "theoretical physicist", 1942);

        String message = Integer.toString(age);
        System.out.println(armstrong);
        System.out.println(hawking);
    }

}
