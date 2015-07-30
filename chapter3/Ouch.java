public class Ouch {
   static int ouch = 7;
   public static void main(String[] args) {
     new Ouch().go(ouch);
     System.out.print(" " + ouch);
   }
   void go(int ouch) {
     ouch++;
     for(int ouch = 3; ouch < 6; ouch++)
       ;
     System.out.print(" " + ouch);
   }
 }

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter3$ javac Ouch.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
Ouch.java:9: error: variable ouch is already defined in method go(int)
     for(int ouch = 3; ouch < 6; ouch++)
             ^
1 error

*/
