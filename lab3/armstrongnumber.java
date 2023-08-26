import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num, r, a = 0;
        System.out.println("Enter a number to check if it is Armstrong or not");
        num = sc.nextInt();
        num1 = num;
        while (num != 0) {
            r = num % 10;
            a = a + r * r * r;
            num = num / 10;
        }
        if (a == num1)
            System.out.println("Number is an Armstrong number");
        else
            System.out.println("Number is not an Armstrong number");
    }
}
