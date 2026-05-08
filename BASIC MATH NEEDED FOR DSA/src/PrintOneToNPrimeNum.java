import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class PrintOneToNPrimeNum {
    static boolean checkPrimeOrNot(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

//    Print 1 to N Prime Number.....
    static void oneToNPrime(int n){
        for(int num = 2; num <= n; num++){
            boolean isPrime = checkPrimeOrNot(num);

            if(isPrime == true){
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        oneToNPrime(n);
    }
}
