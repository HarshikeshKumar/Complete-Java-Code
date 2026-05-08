import java.util.Scanner;

// Prtfect Number Kya hota hai:----
// n=6-->1*6, 2*3, 3*2 --> 1+2+3=6 Mtlb Ye Perfect Number hai.
public class PerfectNumber {

    static void checkPerfectNumber(int num){
        int originalNum = num;
        int sum = 0;
        for(int i = 1; i < num; i++){
            if (num % i == 0){
                // i ne perfectly num ko devide maar diya hai
                // Toh ab factor pair kya banega
                // 1st Factor --> i
                // 2nd Factor ? --> num/i

                int firstFactor = i;
                int secondFactor = num / i;

                sum = sum + firstFactor + secondFactor;
            }
        }
        if(sum == originalNum){
            System.out.println(num + " is a Perfect Number");
        }
        else{
            System.out.println(num + " is Not a Perfect Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        checkPerfectNumber(num);
    }
}
