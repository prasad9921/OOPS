 class Animal 
{

     Animal()
     {
        System.out.println("A new animal has been created!");
     }
    
     void sleep()
     {
        System.out.println("An Animal sleeps...");
     }
     void eat()
     {
        System.out.println("An Animal eats...");
     }
    
}

class Monkey extends Animal 
{

     Monkey()
     {
       System.out.println("A new monkey has been created!");
     }
  
     void jump()
     {
       System.out.println("A monkey jumps...");
     }
     void sleep()
     {
        System.out.println("Monkey sleep on tree branches");
     }
}

  
 class Human extends Monkey {

    Human()
    {
         
       System.out.println("A new human has been created!");
    }
   
     void jump(){
      System.out.println("A human jumps...");
     }
          
     void smile()
     {
        System.out.println("A human smiles...");
     }
     void sleep()
     {
        System.out.println("Humans sleep in beds");
     }
}

 class inhDemo1
 {
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Monkey monkey = new Monkey();
        Human human = new Human();
        
        System.out.println();
   
        animal.sleep();
        animal.eat();
        System.out.println();

        monkey.sleep();
        monkey.eat();
        monkey.jump();
        System.out.println();

        human.sleep();
        human.eat();
        human.jump();
        human.smile();
        System.out.println();
    }
}

