package pkgA;
public class Foo {
int a = 5;
protected int b = 6;
public int c = 7;
}
package pkgB;
import pkgA.*;
public class Baz {
 public static void main(String[] args) {
   Foo f = new Foo();
   System.out.print(" " + f.a);
   System.out.print(" " + f.b);
    System.out.println(" " + f.c);
  }
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter1$ javac Baz.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
Baz.java:7: error: class, interface, or enum expected
package pkgB;
^
Baz.java:8: error: class, interface, or enum expected
import pkgA.*;
^
2 errors

*/
