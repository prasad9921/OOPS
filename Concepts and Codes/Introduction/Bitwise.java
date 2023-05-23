class Bitwise
{

public static void main(String args[]) {

int a=42;
int b=15;
int c,d,e,f;

c=a|b;
d=a&b;
e=a^b;

System.out.println(" or operation, c= "+c);
System.out.println(" and operation, d= "+d);
System.out.println(" xor operation, e= "+e);

f=a<<1;
System.out.println(" after left shift 1 position= "+f);
}
}