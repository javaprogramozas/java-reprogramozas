package v87;

import v43.CelestialBody;
import v73.Person;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class JavaFunctions {

    public static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void main(String[] args) {
        supplier();
        consumer();
        runnable();
        function();
        predicate();
        unaryOperator();
        biFunction();
    }

    private static void supplier() {
        Supplier<String> anonymous = new Supplier<String>() {
            @Override
            public String get() {
                return "A pontos idő: " + LocalTime.now().format(TIME_FORMAT);
            }
        };

        Supplier<String> supplier = () -> "A pontos idő: " + LocalTime.now().format(TIME_FORMAT);

        useSupplier(supplier);
    }

    private static void useSupplier(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

    // ---------------------

    private static void consumer() {
        Consumer<String> anonymous = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.printf("'%s' szöveg %d karakter hosszú%n", s, s.length());
            }
        };

        Consumer<String> consumer = text -> System.out.printf("'%s' szöveg %d karakter hosszú%n", text, text.length());

        useConsumer(consumer);
    }

    private static void useConsumer(Consumer<String> consumer) {
        consumer.accept("Hello World!");
    }

    // ---------------------

    private static void runnable() {
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("Most csak kiírjuk ezt a szöveget...");
            }
        };

        Runnable runnable = () -> System.out.println("Most csak kiírjuk ezt a szöveget...");

        useRunnable(runnable);
    }

    private static void useRunnable(Runnable runnable) {
        runnable.run();
    }

    // ---------------------

    private static void function() {
        Function<String, CelestialBody> anonymous = new Function<String, CelestialBody>() {
            @Override
            public CelestialBody apply(String name) {
                return new CelestialBody(name);
            }
        };

        Function<String, CelestialBody> function = CelestialBody::new;

        useFunction(function);
        //Function.identity();
    }

    private static void useFunction(Function<String, CelestialBody> function) {
        CelestialBody celestialBody = function.apply("Alpha Centauri");
        System.out.println(celestialBody);
    }

    // ---------------------

    private static void predicate() {
        Predicate<String> anonymous = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isBlank();
            }
        };

        Predicate<String> predicate = String::isBlank;

        usePredicate(predicate);
    }

    private static void usePredicate(Predicate<String> predicate) {
        System.out.println("A feltétel eredménye: " + predicate.test("Hello!"));
    }

    // ---------------------

    private static void unaryOperator() {
        UnaryOperator<String> anonymous = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return new StringBuilder(s).reverse().toString();
            }
        };

        UnaryOperator<String> unary = s -> new StringBuilder(s).reverse().toString();

        useUnaryOperator(unary);
    }

    private static void useUnaryOperator(UnaryOperator<String> unary) {
        String word = "csiga";
        System.out.printf("%s => %s%n", word, unary.apply(word));
    }

    // ---------------------

    private static void biFunction() {
        BiFunction<String, Integer, Person> anonymous = new BiFunction<String, Integer, Person>() {
            @Override
            public Person apply(String name, Integer age) {
                return new Person(name, age);
            }
        };

        BiFunction<String, Integer, Person> biFunction = (name, age) -> new Person(name, age);

        useBiFunction(biFunction);
    }

    private static void useBiFunction(BiFunction<String, Integer, Person> biFunction) {
        System.out.println(biFunction.apply("Hello", 15));
    }
}
