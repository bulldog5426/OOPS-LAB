import java.util.Scanner;
class hello
{ public static void main(String args[])
  { 
    int length , breadth , circumference , area ;
    Scanner sc = new Scanner(System.in); 
    length= sc.nextInt();
    breadth= sc.nextInt();
    circumference= 2*(length+breadth);
    area= length * breadth;
    System.out.println("the circumference is " +circumference);
    System.out.println("the area is " +area);
  }
}