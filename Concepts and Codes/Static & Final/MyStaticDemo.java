class StaticExample
{
  static int a = 10;
  static int b;
 
  static void mystaticMethod(int x) 
	{
    System.out.println("x = " + x);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    }
}
class MyStaticDemo
{

	public static void main(String args[]) 
	{
	  StaticExample.mystaticMethod(100);
    }
}
