import java.util.Scanner;
class factorial
{
    public static void main(String args[])
    {
        int n;
        int fact = 1;
        var sc =new Scanner(System.in);
        System.out.println("enter the numberyou wnat the factorial of ");
        n = sc.nextInt();
        for (int i =1 ; i<=n ;i++)
        {
           fact = fact *i;
        }
        System.out.println("the factorial of the given number is " + fact);
    }
}
