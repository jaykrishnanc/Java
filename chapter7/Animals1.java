public class Animals1 {
  class Lamb implements AutoCloseable {
    public void close() {
      throw new RuntimeException("a");
    } }
  public static void main(String[] args) throws IOException {
    new Animals1().run();
  }
  public void run() throws IOException {
    try (Lamb l = new Lamb();) {
      throw new IOException();
    } catch(Exception e) {
      throw e;
    } } }

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter7$ javac Animals1.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
Animals1.java:6: error: cannot find symbol
  public static void main(String[] args) throws IOException {
                                                ^
  symbol:   class IOException
  location: class Animals1
Animals1.java:9: error: cannot find symbol
  public void run() throws IOException {
                           ^
  symbol:   class IOException
  location: class Animals1
Animals1.java:11: error: cannot find symbol
      throw new IOException();
                ^
  symbol:   class IOException
  location: class Animals1
3 errors

*/
