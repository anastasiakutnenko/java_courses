import java.util.Scanner;

public class PhoneValidator {
    private static int[] phoneDigitsArray = new int[9];
    public static void getPhoneNumber(){
        int[] phoneDigitsArray = new int[9];
        Scanner input = new Scanner(System.in);
        String[] prefixArray = new String[]{"50", "95", "66", "99", "63", "73", "93", "67", "96", "98", "97", "91", "92", "94"};
        boolean flag = false;
        int sum = 0;
        System.out.println("Input your phone number: ");
        System.out.print("+380");
        for(int i = 0; i < 9; i++){
            phoneDigitsArray[i] = input.nextInt();
//            System.out.println(phoneDigitsArray[i]);


        }

        String prefix = String.valueOf(phoneDigitsArray[0]) + String.valueOf(phoneDigitsArray[1]);
        System.out.println(prefix);
        for(int i = 0; i < prefixArray .length; i++){
            if(prefixArray[i].equals(prefix)){
                System.out.println("Great! Your phone number passed validation");
                i = prefixArray.length + 1;
                flag = true;
            }
        }
        if (flag == false){
            System.out.println("Sorry, your phone number is invalid");


        }
        if (flag == true)
        for (int i = 0; i < phoneDigitsArray.length; i++){
            sum += phoneDigitsArray[i];
        }
        System.out.println(sum);
        int sumResult = sum/ 10 + sum % 10;
        System.out.println(sumResult);
        switch(sumResult){
            case 1: sumResult = 1;
                System.out.println("One");
                break;
            case 2: sumResult = 2;
                System.out.println("Two");
                break;
            case 3: sumResult = 3;
                System.out.println("Three");
                break;
            case 4: sumResult = 4;
                System.out.println("Four");
                break;
            case 5: sumResult = 5;
                System.out.println("Five");
                break;
            case 6: sumResult = 6;
                System.out.println("Six");
                break;
            case 7: sumResult = 7;
                System.out.println("Seven");
                break;
            case 8: sumResult = 8;
                System.out.println("Eight");
                break;
            case 9: sumResult = 9;
                System.out.println("Nine");
                break;

        }
        }

    }

