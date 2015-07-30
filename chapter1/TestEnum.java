enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;
	Animals(String s) { sound = s; }
}
class TestEnum{
	static Animals a;
	public static void main(String[] args) {
		System.out.println(a.DOG.sound + " " + a.FISH.sound);
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter1$ javac TestEnum.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter1$ java TestEnum
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
woof burble


*/
