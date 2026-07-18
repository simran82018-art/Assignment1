
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            System.out.println("Table of "+i);
            for(int j=1;j<=10;j++){
                System.out.println(i +" X "+ j+" = "+ i*j);
                }
            }
            sc.close();
        
    
}
}
