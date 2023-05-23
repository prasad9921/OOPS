import java.io.*;
class StringBuilder
{
 public static void main(String[] args)
 {
   StringBuilder sb = new StringBuilder("Hello ");
   sb.append("World");
   System.out.println(sb);// prints Hello World
   
   StringBuilder sb1 = new StringBuilder("HellWorld");
   sb1.insert(4, "o ");
   System.out.println(sb1);// prints Hello World

   StringBuilder sb2 = new StringBuilder("Hello World!");
   sb2.replace(6,11,"Earth");
   System.out.println(sb2);// prints Hello Earth!

   StringBuilder sb3 = new StringBuilder("JournalPaper");
   sb3.delete(7,14);
   System.out.println(sb3);// prints Journal
   
   StringBuilder sb4 = new StringBuilder("lived");
   sb4.reverse();
   System.out.println(sb4);// prints devil
 }
}
