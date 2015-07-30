public class Happy {
  int id;
  Happy(int i) { id = i; }
  public static void main(String[] args) {
    Happy h1 = new Happy(1);
    Happy h2 = h1.go(h1);
    System.out.println(h2.id);
  }
  Happy go(Happy h) {
    Happy h3 = h;
    h3.id = 2;
    h1.id = 3;
    return h1;
  }
}


/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter3$ javac Happy.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 



Happy.java:12: error: cannot find symbol
    h1.id = 3;
    ^
  symbol:   variable h1
  location: class Happy
Happy.java:13: error: cannot find symbol
    return h1;
           ^
  symbol:   variable h1
  location: class Happy
2 errors

*/
