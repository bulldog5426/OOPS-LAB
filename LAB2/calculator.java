import java.util.Scanner;
class Calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int ch;
float x;
float y;
char ch1;
do{
System.out.println("Press 1 for Addition");
System.out.println("Press 2 for Subtraction");
System.out.println("Press 3 for Multiplication");
System.out.println("Press 4 for Division");
System.out.println("Enter your choice");
ch=sc.nextInt();
System.out.println("Enter the two numbers");
x=sc.nextFloat();
y=sc.nextFloat();
switch(ch)
{
case 1:{
System.out.println(x+y);
break;
}
case 2:{
System.out.println(x-y);
break;
}
case 3:{
System.out.println(x*y);
break;
}
case 4:{
System.out.println(x/y);
break;
}
case 5:{
break;
}
default: System.out.println("Wrong choice");
}
System.out.println("Press y to do another calculation");
System.out.println("Press n to exit");
ch1=sc.next().charAt(0);
}while(ch1!='n' && ch1=='y');
}
}
