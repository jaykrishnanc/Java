import java.util.*;
public class GeoCache {
  public static void main(String[] args) {
    String[] s = {"map", "pen", "marble", "key"};
    Othello o = new Othello();
    Arrays.sort(s,o);
    for(String s2: s) System.out.print(s2 + " ");
    System.out.println(Arrays.binarySearch(s, "map"));
  }
  static class Othello implements Comparator<String> {
    public int compare(String a, String b) { return b.compareTo(a); }
  }
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter11$ javac GeoCache.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter11$ java GeoCache
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
pen marble map key -1

*/
