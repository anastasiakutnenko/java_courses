import java.util.Scanner;

public class Factorial {
    public static void factorial(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input your digit: ");
        int digit = input.nextInt();
        int factorial  = 1;
        for (int i = 1; i <= digit; i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial of your digit = " + factorial);
    }
}
