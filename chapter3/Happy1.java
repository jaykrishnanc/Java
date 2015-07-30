public class Happy1 {
  int id;
  Happy1(int i) { id = i; }
  public static void main(String[] args) {
    Happy1 h1 = new Happy1(1);
    Happy1 h2 = h1.go(h1);
    System.out.println(h2.id);
  }
  Happy1 go(Happy1 h) {
    Happy1 h3 = h;
    h3.id = 2;
    h1.id = 3;
    return h1;
  }
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter3$ javac Happy1.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
Happy1.java:12: error: cannot find symbol
    h1.id = 3;
    ^
  symbol:   variable h1
  location: class Happy1
Happy1.java:13: error: cannot find symbol
    return h1;
           ^
  symbol:   variable h1
  location: class Happy1
2 errors


*/
