import java.util.Scanner;

public class SumOfDigitsOfANumber {

    static void sumOfDigit(int num){
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of digits = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
//        int num = 53127; // Expexted Output-> 18

        sumOfDigit(num);
    }
}
