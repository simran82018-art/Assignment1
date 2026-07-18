import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = Start; i <= end; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}