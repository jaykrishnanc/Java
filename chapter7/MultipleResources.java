public class MultipleResources {
  class Lamb implements AutoCloseable {
    public void close() throws Exception {
       System.out.print("l");
    } }
  class Goat implements AutoCloseable {
    public void close() throws Exception {
       System.out.print("g");
    } }
  public static void main(String[] args) throws Exception {
    new MultipleResources().run();
  }
  public void run() throws Exception {
    try (Lamb l = new Lamb();
         System.out.print("t");
         Goat g = new Goat();) {
      System.out.print("2");
    } finally {
      System.out.print("f");
    } } }

/*

System.out.println cannot be in the declaration clause of a try
-with-resources block because it does not declare a variable. If the 
println was removed, the answer would be A because resources are closed in the opposite order they are created

*/
