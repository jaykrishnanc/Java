public class Telescope {
	static int magnify = 2;
	public static void main(String[] args) {
		go();
	}
	static void go()
	{
		int magnify = 3;
		zoomIn();
	}
	static void zoomIn()
	{
		magnify *= 5;
		zoomMore(magnify);
		System.out.println(magnify);
	}
	static void zoomMore(int magnify)
	{
		magnify *= 7;
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter3$ java Telescope
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
10

*/
