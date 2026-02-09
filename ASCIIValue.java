import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char ch = sc.next().charAt(0);

            int ascii = ch;
            System.out.println(ascii);
        }
    }
}
