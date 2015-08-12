public class Banana {
	public static void main(String[] args) {
		String in = "1 a2 b 3 c4d 5e";
		String[] chunks = in.split(args[0]);
		System.out.println("count : " + chunks.length);
		for(String s : chunks)
			System.out.print(">" + s + "< ");
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ java Banana " "
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
count : 6
>1< >a2< >b< >3< >c4d< >5e<


jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ java Banana "\d"
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
count : 6
>< > a< > b < > c< >d < >e< 

*/
