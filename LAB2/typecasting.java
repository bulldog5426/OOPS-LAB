class analyze
{


public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
            System.out.println("Enter an integer:");
          int a=sc.nextInt();
          System.out.println("Enter a double:");
          double b=sc.nextDouble();
          System.out.println("Enter a char:");
          char c = sc.next().charAt(0);
          byte d = (byte)a;
          int e=(int)c;
          byte f=(byte)b;
          int g=(int)b;
          System.out.println("After conversion from int to byte:"+d);
          System.out.println("After conversion from char to int:"+e);
          System.out.println("After conversion from double to byte:"+f);
          System.out.println("After conversionfrom double to int:"+g);;
          
          
                  
         
     }
}
