import java.util.*;

public class Condition {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("Positive");
            } else if (number < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
    }
}
