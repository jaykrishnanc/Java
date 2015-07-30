import java.util.regex.*;
class Regex2 {
  public static void main(String[] args) {
    Pattern p = Pattern.compile(args[0]);
    Matcher m = p.matcher(args[1]);
    boolean b = false;
    while(b = m.find()) {
      System.out.print(m.start() + m.group());
    }
  }
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ javac Regex2.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ java Regex2 "\d*" ab34ef
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
01234456

*/
