import java.util.Scanner;
class leapyear
{
    public static void main(String args[])
    {
        int year;
        boolean leapyear=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year u wnat to check ");
        year = sc.nextInt();
        if ((year % 400)!=0)
        {
           if ((year % 100) !=0)
           {
               if ((year % 4) == 0)
               {
                   leapyear = true;
               }
           }
        }
        
        if (leapyear)
        {
           System.out.println("the given year is a leap year");
        }
        else 
        {
            System.out.println("it is a common year");
        }
        

    }
}
