import java.util.Scanner;

public class GCD {

    static int findGcd(int a, int b){
        while(b != 0){
            int oldValueOfb = b;
            b = a % b;
            a = oldValueOfb;

        }
        int ans = a;
        return a;
    }


//  Bss ye check krr raha tha Parameter aur Argument me different variable dene pe code chal raha hai ya nhi,
//    Chal raha hai mtlb Parameter aur Argument dono ka variable name different hota hai

//    static int findGcd(int num1, int num2){
//        while(num2 != 0){
//            int temp = num2;
//            num2 = num1 % num2;
//            num1 = temp;
//
//        }
//        int ans = num1;
//        return ans;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value og a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        int res = findGcd(a, b);
        System.out.println(res);
    }
}
