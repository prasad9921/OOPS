import java.util.Scanner;
 
class inputAllTypes
{
   public static void main(String args[])
   {
      byte by;
      int a;
      float b;
      double d;
      String s;
 
      Scanner in = new Scanner(System.in);

      System.out.println("Enter a string");
      s = in.nextLine();
      System.out.println("You entered string "+s);

      System.out.println("Enter an integer number below 128");
      by = in.nextByte();
      System.out.println("You entered integer "+by);
 
      System.out.println("Enter an integer");
      a = in.nextInt();
      System.out.println("You entered integer "+a);
 
      System.out.println("Enter a float number");
      b = in.nextFloat();
      System.out.println("You entered float "+b); 
      
      System.out.println("Enter a double number");
      d = in.nextDouble();
      System.out.println("You entered float "+d);   

    }
}
