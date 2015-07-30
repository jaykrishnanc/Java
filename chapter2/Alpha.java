class Alpha {
   static String s = " ";
   protected Alpha() { s += "alpha "; }
 }
 class SubAlpha extends Alpha {
   private SubAlpha() { s += "sub "; }
 }
 public class SubSubAlpha extends Alpha {
   private SubSubAlpha() { s += "subsub "; }
   public static void main(String[] args) {
     new SubSubAlpha();
     System.out.println(s);
   }
 }

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter2$ javac Alpha.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
Alpha.java:8: error: class SubSubAlpha is public, should be declared in a file named SubSubAlpha.java
 public class SubSubAlpha extends Alpha {
        ^
1 error

*/
