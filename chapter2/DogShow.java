class Dog {
	public void bark() { System.out.print("woof "); }
}
class Hound extends Dog {
	public void sniff() { System.out.print("sniff "); }
	public void bark() { System.out.print("howl "); }
}
public class DogShow{
	public static void main(String[] args) { new DogShow().go(); }
	void go() {
		new Hound().bark();
		((Dog) new Hound()).bark();
		((Dog) new Hound()).sniff();
	}
}
	
/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter2$ javac DogShow.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
DogShow.java:13: error: cannot find symbol
		((Dog) new Hound()).sniff();
		                   ^
  symbol:   method sniff()
  location: class Dog
1 error

*/
