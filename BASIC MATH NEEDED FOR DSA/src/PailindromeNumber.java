import java.util.Scanner;

public class PailindromeNumber {

//    Step 1: Reverse Number.............................
    static int revofNum(int num){
        int revNum = 0;

        while(num != 0){
            int digit = num % 10;
            // Reverse number
            revNum = revNum * 10 + digit;

            // Remove last digit from num
            num = num / 10;
        }
        return revNum;
    }

//    Step 2: Check Pailindrome or not..............
    static void checkPailindrome(int num){
        int originalNum = num;
        int reverseNumber = revofNum(num);

        if(originalNum == reverseNumber){
            System.out.println("Yes, It's a Pailindrome Number");
        }
        else{
            System.out.println("No, It's Not a Pailindrome Number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        // Call revofNum()
        int reverseNumber = revofNum(num);
        System.out.println("Reverse of your number is: " + reverseNumber);

        // call checkPailindrome()
        checkPailindrome(num);
    }
}
