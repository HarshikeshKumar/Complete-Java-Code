public class CountDigitsOfNumber {

    static int countDigits(int num){
//        Agar num = 0, Toh mai ruk jaunga
//        Agar num != 0, Toh processing krta rahunga
        int count = 0;
        while(num != 0){
            int digit = num % 10;
            count++;
            //remove last digit
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 53127;
        int ans = countDigits(num);
        System.out.println("The number of digits in yout Number is: " + ans);
    }
}
