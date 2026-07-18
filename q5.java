import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secret = 27;

        for (int i = 1; i <= 5; i++) {

            int guess = sc.nextInt();

            if (guess == secret) {
                System.out.println("Congratulations! You guessed it.");
                break;
            } else if (guess < secret) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }

            if (i == 5) {
                System.out.println("Better Luck Next Time!");
            }
        }

        sc.close();
    
}
}
