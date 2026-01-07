import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();

            switch (button) {
                case 1 -> System.out.println("Hello");
                case 2 -> System.out.println("Bonjour");
                case 3 -> System.out.println("Namaste");
                default -> System.out.println("Invalid Button");
            }
        }
    }
}
