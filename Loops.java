import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // FOR LOOP
        // for(int counter = 1; counter <= 10; counter++) {
        //     System.out.println(counter+"Hello World");
        // }

        // WHILE LOOP
        // int counter = 1;
        // while(counter <= 10) {
        //     System.out.println(counter+"Hello World");
        //     counter++;

        // DO WHILE LOOP
        // int counter = 1;
        // do {
        //     System.out.println(counter+"Hello World");
        //     counter++;
        // } while(counter <= 10);

       
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + i;
            }

            System.out.println("The sum is: " + sum);
        }
    

    }
}
