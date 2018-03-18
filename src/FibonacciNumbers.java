import java.util.Scanner;

public class FibonacciNumbers {
    private static int input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of digits in sequence: ");
        int limit = input.nextInt();
        return limit;
    }
    public static void fibonacci(){

        int limit = FibonacciNumbers.input();
        int array[] = new int[limit];
        array[0] = 1;
        array[1] = 1;

        for(int i = 2; i < limit; i++){
            array[i] = array[i-1] + array[i-2];
        }
        for (int i = 0; i < limit; i++)
            System.out.println(array[i]);
    }
}
