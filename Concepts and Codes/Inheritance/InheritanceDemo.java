class Dog
{
 String name;
 
 Dog(String name)
 {
 this.name = name;
 }
 
 String getName()
 {
   return name;
 }
 
 String bark()
 {
 return "Makes Normal Barking Sound";
 }
} 

class Labrador extends Dog
{
 
 int breedWeight = 75;
 
 Labrador(String name)
 {
   super(name);
   
 }
 
 String bark()
 {
   return "Makes Higher Barking Sound";
 }
 
 int avgBreedWeight()
 {
  return breedWeight;
 }
} 

class Yorkshire extends Dog
{
 
 Yorkshire(String name)
 {
   super(name);
 }
  
 public String bark()
 {
   return "Makes Lower Barking Sound";
 }
} 

public class InheritanceDemo
{
 public static void main(String[] args)
 {
 Dog dog = new Dog("Spike");
 System.out.println(dog.getName() + " " + dog.bark());
 
 Labrador lb = new Labrador("Jimmy");
 System.out.println(lb.getName() + " " + lb.bark()+" with average weight: " +lb.avgBreedWeight());
 
 Yorkshire ys = new Yorkshire("Puppy");
 System.out.println(ys.getName() + " " + ys.bark());
 }
} 