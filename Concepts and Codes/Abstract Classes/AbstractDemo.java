abstract class A
{
	abstract void absdisplay();
	
	void display()
	{
		System.out.println("Hai from Class A");
	}
}

class B extends A
{
		void absdisplay()
		{
			System.out.println("Hai from Abstract Display");
		}
	
}

class AbstractDemo
{	
	public static void main(String args[])
	{
		A ob2;
		ob2=new B();
		B ob1=new B();
		ob1.absdisplay();
		ob1.display();
		ob2.display();
	}
}

     

	
