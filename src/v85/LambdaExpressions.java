package v85;

import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Kati", "Gyuri");
        Greeter formalGreeter = new Greeter() {
            @Override
            public String greet(String name) {
                return "Üdvözöllek " + name + "!";
            }
        };
        greetPeople(names, formalGreeter);
        greetPeople(names, name -> "Szia " + name);
        greetPeople(names, name -> "Hello " + name + "!");
    }

    private static void greetPeople(List<String> names, Greeter greeter) {
        for (String name : names) {
            System.out.println(greeter.greet(name));
        }
        System.out.println();
    }

}
