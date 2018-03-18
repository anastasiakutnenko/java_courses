import java.util.Scanner;

public class ArithmeticMean {
    private static int[] getNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size: ");
        int size = input.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("array[%d]=", i);
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void arithmeticMean() {
        float sum = 0;
        int[] array = ArithmeticMean.getNumbers();
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);
    }
}
