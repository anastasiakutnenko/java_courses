import java.util.Scanner;

public class RecursiveFactorial {

    public  void recursiveFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Число");
        int number = scanner.nextInt();
        long factorial;
        factorial = factorial(number);
        System.out.println("Факториал числа " + number + " = " + factorial);
    }

    private static long factorial(int n) {
        long result;
        if (n == 0 || n == 1) {
            return 1;
        }
        result = factorial(n - 1) * n;
        return result;
    }
}