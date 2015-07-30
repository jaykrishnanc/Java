class Mammal {
   String name = "furry ";
   String makeNoise() { return "generic noise"; }
 }
 class Zebra extends Mammal {
   String name = "stripes ";
   String makeNoise() { return "bray"; }
}
 public class ZooKeeper {
   public static void main(String[] args) { new ZooKeeper().go(); }
   void go() {
     Mammal m = new Zebra();
     System.out.println(m.name + m.makeNoise());
   }
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter2$ javac ZooKeeper.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter2$ java ZooKeeper
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
furry bray

*/
