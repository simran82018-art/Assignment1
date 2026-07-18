import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            int num = i;
            int sum = 0;

            while (num > 0) {

                int digit = num % 10;
                int fact = 1;

                for (int j = 1; j <= digit; j++) {
                    fact = fact * j;
                }

                sum = sum + fact;
                num = num / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }

        sc.close();
    
    }
}
   

