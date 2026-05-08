import java.util.Scanner;

public class LcmOfANumber {

//    Step 1: Find gcd
    static int findGcd(int a, int b){
        while(b != 0){
            int oldValueOfb = b;
            b = a % b;
            a = oldValueOfb;
        }
        int gcdAns = a;
        return gcdAns;
    }

//    Step 2: Find LCM Of a Number
    static int getLcm(int a, int b){
        int gcd = findGcd(a, b); // findGcd(18, 12) -> 6
        int product = a * b; // 18*12 -> 216
        int lcm = product/gcd; // 216/6 -> 36

        return lcm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        int ans = getLcm(a, b);
        System.out.println("LCM of your Number is: " + ans);
    }
}
