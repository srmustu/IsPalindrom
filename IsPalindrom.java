import java.util.Scanner;
public class IsPalindrom {

    static boolean isPalindrom(int num){
        int lastDigit, reverseNumber = 0;

        int tempNumber = num;

        while (tempNumber != 0){
            lastDigit = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            tempNumber /= 10;
        }
        if (num == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String m1;
        int num;

        m1 = "Please enter the number you want to check if it is a palindrome : ";
        System.out.print(m1);
        num = entry.nextInt();

        System.out.print(isPalindrom(num));
    }
}
