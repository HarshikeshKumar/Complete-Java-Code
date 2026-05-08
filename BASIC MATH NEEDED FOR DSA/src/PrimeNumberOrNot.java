import java.util.Scanner;

public class PrimeNumberOrNot {

    static boolean checkPrime(int num){

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        // Yaha tabhi pahuch paoge, jb loop se bahar nikloge.
        // Aur loop se tabhi bahar nikloge, jb kabhi bhi remainder me zero n aaye
        // Aur agar kabhi ramainder me 0 nhi aaya iska mtlb It's a Prime Number
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        boolean ans = checkPrime(num);
        System.out.println(ans);
    }
}
