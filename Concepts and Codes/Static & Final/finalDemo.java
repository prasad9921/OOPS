class Sample
{
	final int a=10;
	void disp()
	{
		System.out.println(a++);
	}
}
class finalDemo
{
	public static void main(String args[])
	{
		Sample s=new Sample();
		s.disp();
	}
}
