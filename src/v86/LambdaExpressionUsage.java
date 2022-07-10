package v86;

import v73.Person;
import v85.Greeter;

import java.util.Comparator;
import java.util.List;

import static v84.AnonymousExamples.createPeople;

public class LambdaExpressionUsage {

    public static void main(String[] args) {

        // simple lambda
        Greeter informalGreeter = name -> "Szia " + name;

        // lambda with multiline block
        Greeter screamer = name -> {
            StringBuilder sb = new StringBuilder(name.toUpperCase());
            for (int i = 1; i < sb.length(); i += 2) {
                char c = sb.charAt(i);
                sb.setCharAt(i, Character.toLowerCase(c));
            }
            return "Hello " + sb;
        };

        System.out.println(screamer.greet("Zolika"));

        // empty parameter list + void
        Runnable doSomething = () -> System.out.println("Just do it!");
        doSomething.run();

        // multiple input parameters
        List<Person> people = createPeople();
        Comparator<? super Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        Comparator<Person> ageComparator2 = (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge());
        people.sort(ageComparator2);
        System.out.println(people);

        // static method reference
        Greeter warm = LambdaExpressionUsage::screamer;
        System.out.println(warm.greet("Zoli"));

        // instance method reference
        WhoAreYou asker = new WhoAreYou();
        Greeter asking = asker::whoAreYou;
        System.out.println(asking.greet("Zoli"));

        // lambda parameter name clash
        String name = "Ákos";
        Greeter hiGreeter = subject -> "Hi " + subject;

        // effective final local variables
        //Greeter asking2 = a -> asker.whoAreYou(a);
        asker = null;
    }

    private static String screamer(String name) {
        StringBuilder sb = new StringBuilder(name.toUpperCase());
        for (int i = 1; i < sb.length(); i += 2) {
            char c = sb.charAt(i);
            sb.setCharAt(i, Character.toLowerCase(c));
        }
        return "Hello " + sb;
    }
}
