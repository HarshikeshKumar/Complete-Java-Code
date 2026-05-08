import java.util.Scanner;

public class ReverseANumber {

    static int revNumber(int num){
//       Formula = revNumber * 10 + currentDigit
        int revNum = 0;

        while (num != 0) {
            // iss se num ka last digit mil jayega
            int digit = num % 10;
            // Final answer
            revNum = revNum * 10 + digit;
            // Remove Last digit from num
            num = num / 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int ans = revNumber(num);
        System.out.println("Reverse of your Number is: " + ans);

    }
}
