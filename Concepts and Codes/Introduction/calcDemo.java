import java.io.*;
import java.util.Scanner;
import Demo.operations;

class calcDemo
{
public static void main(String args[])
{
	int num1,num2,result;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter Number 1:");
	num1=in.nextInt();
	System.out.println("Enter Number 2:");
	num2=in.nextInt();
	
	operations ob1=new operations();
	result=ob1.add(num1,num2);
	System.out.println("Addition of Two Numbers is:"+result);
	
	result=ob1.sub(num1,num2);
	System.out.println("Substraction of Two Numbers is:"+result);
	
	result=ob1.mul(num1,num2);
	System.out.println("Multiplication of Two Numbers is:"+result);
	
	result=ob1.div(num1,num2);
	System.out.println("Division of Two Numbers is:"+result);
	
	
}

}

class operations
{
int add(int a,int b)
{
 int c=a+b;
 
 return c;

}

int sub(int a,int b)
{
 int c=a-b;
 
 return c;

}

int mul(int a,int b)
{
 int c=a*b;
 
 return c;

}

int div(int a,int b)
{
 int c=a/b;
 
 return c;

}
}
