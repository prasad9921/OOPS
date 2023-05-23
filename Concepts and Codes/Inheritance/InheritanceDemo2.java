class Numbers
{
int a,b;

Numbers(int x, int y) 
{
a=x;
b=y;
System.out.println("Hai");

}

}

class SumOfThree extends Numbers
{
int c;
SumOfThree(int x, int y,int z)
{
	super(x,y);
    System.out.println("Hello");
	a=x;
    b=y;	
	c=z;
}
void sum()
{
System.out.println("Addition is:" +(a+b+c));
}

}

class InheritanceDemo2
{
	
	public static void main(String args[])
	{
		Numbers n=new Numbers(10,20);
		SumOfThree ob1=new SumOfThree(10,20,30);
		ob1.sum();
		System.out.println(" "+ob1.a);
		System.out.println(" "+ob1.b);
	
	}
}