 class Building {
   Building() {  System.out.print("b ");  }
   Building(String name) {
     this();   System.out.print("bn " + name);
   }
 }
 public class House extends Building {
   House() {  System.out.print("h ");  }
   House(String name) {
     this();   System.out.print("hn " + name);
   }
   public static void main(String[] args) { new House("x "); }
 } 

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter2$ javac House.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter2$ java House
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
b h hn x 

*/
