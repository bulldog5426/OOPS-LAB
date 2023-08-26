import java.util.Scanner;
class table
{
    public static void main(String args[])
    {
        int n ;
        System.out.println("enter the number whose table u wnat printed");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i=0 ; i<=10 ;i++)
        {
            System.out.println(n +"*" + i +"=" +n*i);
        }
    }
}