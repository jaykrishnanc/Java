public class Dark {
   int x = 3;
   public static void main(String[] args) {
     new Dark().go1();
   }
   void go1() {
     int x;
     go2(++x);
   }
   void go2(int y) {
     int x = ++y;
     System.out.println(x);
   }
 }

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter3$ javac Dark.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
Dark.java:8: error: variable x might not have been initialized
     go2(++x);
           ^
1 error

*/
