class callByValue
{

public static void main(String args[])
{

int a=5;

increase(a);

System.out.println("The value of a is:"+a);

}

static void increase(int p)
{

p=p+1;

}

}
