public class PrintDigitsOfANumber {

    static void printDigits(int num){

//        Agar num = 0, Toh mai ruk jaunga
//        Agar num != 0, Tho Processing karta rahunga

        while(num != 0){
            int digit = num % 10;
            System.out.println(digit);

//            Last wala digit remove karne ke liye
            num = num / 10;
        }
    }

    public static void main(String[] args) {
        int num = 53127;
        printDigits(num);
    }
}
