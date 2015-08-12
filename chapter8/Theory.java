public class Theory {
   public static void main(String[] args) {
     String s1 = "abc";
     String s2 = s1;
     s1 += "d";
     System.out.println(s1 + " " + s2 + " " + (s1==s2));

     StringBuffer sb1 = new StringBuffer("abc");
     StringBuffer sb2 = sb1;
     sb1.append("d");
     System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2));
   } 
}

/*


jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ javac Theory.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ java Theory
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
abcd abc false
abcd abcd true


*/
