import java.io.*;
public class ReadingFor {
	public static void main(String[] args) {
		String s;
		try {
			FileReader fr = new FileReader("myfile.txt");
			BufferedReader br = new BufferedReader(fr);
			while((s = br.readLine()) != null)
				System.out.println(s);
			br.flush();
		} catch (IOException e) { System.out.println("io error"); }
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ javac ReadingFor.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
ReadingFor.java:10: error: cannot find symbol
			br.flush();
			  ^
  symbol:   method flush()
  location: variable br of type BufferedReader
1 error

*/
