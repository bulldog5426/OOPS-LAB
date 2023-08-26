import java.util.Scanner;
class multiplyanddivide
{  
    public static void main (String args[])
    {
       int a , multi , div;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       a = sc.nextInt();
       multi = a<<1;
       div = a>>1;
       System.out.println(multi + "\n");
       System.out.println(div + "\n");
    }
}
