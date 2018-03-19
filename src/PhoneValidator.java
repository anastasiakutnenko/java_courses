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


        }

        String prefix = String.valueOf(phoneDigitsArray[0]) + String.valueOf(phoneDigitsArray[1]);
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
        while(sum/10 >= 1) {
            int sumResult = sum / 10 + sum % 10;
            sum=sumResult;
            System.out.println(sum);
        }

        switch(sum){
            case 1: sum = 1;
                System.out.println("One");
                break;
            case 2: sum = 2;
                System.out.println("Two");
                break;
            case 3: sum = 3;
                System.out.println("Three");
                break;
            case 4: sum = 4;
                System.out.println("Four");
                break;
            case 5: sum = 5;
                System.out.println("Five");
                break;
            case 6: sum = 6;
                System.out.println("Six");
                break;
            case 7: sum = 7;
                System.out.println("Seven");
                break;
            case 8: sum = 8;
                System.out.println("Eight");
                break;
            case 9: sum = 9;
                System.out.println("Nine");
                break;

        }
        }

    }

