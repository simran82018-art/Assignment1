import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " -> Even");
            } else {
                System.out.println(i + " -> Odd");
            }
        }

       
        for (int i = 1; i <= N; i++) {
            System.out.println("Table of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }

        sc.close();
    }
}