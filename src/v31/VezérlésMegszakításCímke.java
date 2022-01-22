package v31;

public class VezérlésMegszakításCímke {
    public static void main(String[] args) {

        külső:
        for (int i = 1; i <= 10; i++) {
            belső:
            for (int j = 1; j <= 10; j++) {
                if (j > i) {
                    continue külső;
                }
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
