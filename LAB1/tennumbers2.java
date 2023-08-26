import java.util.Scanner;
class numbers
{
    public static void main(String args[])
    {
        int pos=0,neg=0,zero=0,n,i;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for (i=0;i<10;i++){
            n=sc.nextInt();
            if (n>0){
                pos++;
            }
            else if (n<0){
                neg++;
            }
            else {
                zero++;
            }
        }
        System.out.println("positive number= " +pos);
        System.out.println("negative number= " +neg);
        System.out.println("Zero number= " +zero);

    }
}