import java.util.Scanner;

public class ArmstrongNumber {
//    n=153 --> 1^3 + 5^3 + 3^3=153 --> It's an Armstrong Number

    static void checkArmstrongNum(int num){

        int originalNum = num;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            int cubeOfDigit = digit*digit*digit;
            sum = sum + cubeOfDigit;

             // Digits remove from num
            num = num / 10;
        }
        if(sum == originalNum){
            System.out.println("Yes, It's an Armstrong Number");
        }
        else{
            System.out.println("No, It's Not an Armstrong Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        checkArmstrongNum(num);

    }
}
