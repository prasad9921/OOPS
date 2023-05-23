import java.io.*;
abstract class Shape 
{

  private int numSides;
  Shape(int numSides)
  {
  this.numSides = numSides;
  }
  public double getNumSides()
  {
    return numSides; 
  }
    public abstract double getArea();
    public abstract double getPerimeter();
 } 

class Rectangle extends Shape 
{
   private double height, width;
   public Rectangle(double w, double h) 
   {
    super(4);
    this.height = h;
    this.width = w;
   }
   public double getArea()
   {
    return height * width;
   }
  public double getPerimeter() 
  {
    return 2 * (height + width);
  }
} 

class Square extends Shape 
{
   private double height, width;
   public Square(double w, double h) 
   {
    super(4);
    this.height = h;
    this.width = w;
   }
   public double getArea()
   {
    return height * height;
   }
  public double getPerimeter() 
  {
    return 4 * height;
  }
} 

public class AbstractDemo3
{
    public static void main(String args[])
    {
        Square sq=new Square(4,8);
        Rectangle re=new Rectangle(4,4);
        
        double sqArea=sq.getArea();
        double sqPerimeter=sq.getPerimeter();
        
        System.out.println("Area of Square is: " +sqArea);
        System.out.println("Perimeter of Square is: " +sqPerimeter);
        
        double reArea=re.getArea();
        double rePerimeter=re.getPerimeter();
        
        System.out.println("Area of Square is: " +reArea);
        System.out.println("Perimeter of Square is: " +rePerimeter);
    }
}
