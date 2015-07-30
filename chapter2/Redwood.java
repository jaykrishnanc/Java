public class Redwood extends Tree {
   public static void main(String[] args) {
     new Redwood().go();
   }
   void go() {
     go2(new Tree(), new Redwood());
     go2((Redwood) new Tree(), new Redwood());
   }
   void go2(Tree t1, Redwood r1) {
     Redwood r2 = (Redwood)t1;
      Tree t2 = (Tree)r1;
   }
 }
class Tree { }


/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter2$ javac Redwood.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter2$ java RedwoodPicked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
Exception in thread "main" java.lang.ClassCastException: Tree cannot be cast to Redwood
	at Redwood.go2(Redwood.java:10)
	at Redwood.go(Redwood.java:6)
	at Redwood.main(Redwood.java:3)

*/
