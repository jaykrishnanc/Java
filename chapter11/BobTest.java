public class BobTest {
	public static void main(String[] args) {
		Bob f = new Bob("GoBobGo",19);
		System.out.println(f);
	}
}
class Bob {
	int shoeSize;
	String nickName;
	Bob(String nickName,int shoeSize) {
		this.shoeSize = shoeSize;
		this.nickName = nickName;
	}
	public String toString() {
		return("I am a Bob, but you can call me " + nickName + ". My shoe size is " + shoeSize);
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter11$ java BobTest
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
I am a Bob, but you can call me GoBobGo. My shoe size is 19

*/
