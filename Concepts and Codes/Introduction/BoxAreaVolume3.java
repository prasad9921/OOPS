
import java.util.Scanner;
class BoxAreaVolume3
{
double w;
double h;
double d;
double a;
double v;

BoxAreaVolume3(){
w=10;
h=20;
d=30;
}

BoxAreaVolume3(double x)
{
w=x;
h=x;
d=x;
}
BoxAreaVolume3(double x, double y, double z){
w=x;
h=y;
d=z;
}


double area(){

a = w*h;
return a;

}

double volume(){

v=w*d*h;
return v;

}

public static void main(String args[]){

double ar,vol;
BoxAreaVolume3 ob1=new BoxAreaVolume3(); 
BoxAreaVolume3 ob2=new BoxAreaVolume3(2);
BoxAreaVolume3 ob3=new BoxAreaVolume3(10,15,10);

ar=ob1.area();
vol=ob1.volume();

System.out.println(" area of the First box="+ar);
System.out.println(" volume of the first box="+vol);

ar=ob2.area();
vol=ob2.volume();

System.out.println(" area of the First box="+ar);
System.out.println(" volume of the first box="+vol);

ar=ob3.area();
vol=ob3.volume();

System.out.println(" area of the First box="+ar);
System.out.println(" volume of the first box="+vol);


 }
}
