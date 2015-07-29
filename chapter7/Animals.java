public class Animals {
  class Lamb implements Closeable {
    public void close() {
      throw new RuntimeException("a");
    } }
  public static void main(String[] args)  {
    new Animals().run();
  }
  public void run()  {
    try (Lamb l = new Lamb();) {
      throw new IOException();
    } catch(Exception e) {
      throw new RuntimeException("c");
    } } }

/*

*********RuntimeException c with no suppressed exception

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter7$ javac Animals.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
Animals.java:2: error: cannot find symbol
  class Lamb implements Closeable {
                        ^
  symbol:   class Closeable
  location: class Animals
Animals.java:10: error: incompatible types: try-with-resources not applicable to variable type
    try (Lamb l = new Lamb();) {
              ^
    (Animals.Lamb cannot be converted to AutoCloseable)
Animals.java:11: error: cannot find symbol
      throw new IOException();
                ^
  symbol:   class IOException
  location: class Animals
3 errors


*/
