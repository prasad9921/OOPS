
class Box 
{
double width;
double height;
double depth;

Box(double w,double h,double d) 
{
	System.out.println("HA");
width = w;
height = h;
depth = d;
}

double volume() 
{
return width * height * depth;
}
}

class BoxWeight extends Box 
{
double weight; 

BoxWeight(double wei) 
{
super(10,20,30);
System.out.println("Why");
weight=wei;
  }
  
  void display(){
	  System.out.println("Box weight:" + weight);
  }
}

class demoBoxWeight {
public static void main(String args[]) {

BoxWeight  boxweight1= new BoxWeight(34.3);
double vol;

vol = boxweight1.volume();
System.out.println("Volume of mybox1 is " + vol);
boxweight1.display();
  }
}
