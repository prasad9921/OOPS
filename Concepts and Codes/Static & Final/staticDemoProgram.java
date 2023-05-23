class staticDemo
{
String first;
String last;

static int members;

staticDemo(String fn, String ln)
{
first=fn;
last=ln;
members++;

System.out.println("Constructor for "+first+" "+last+"Total Members: "+members);
}
}

class staticDemoProgram
{
public static void main(String args[])
{

staticDemo sd1=new staticDemo("Ravi","Varma");
staticDemo sd2=new staticDemo("Kumar","Raja");
staticDemo sd3=new staticDemo("Sachin","Tendulkar");
}
}

 