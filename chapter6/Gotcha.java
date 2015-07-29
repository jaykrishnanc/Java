public class Gotcha {
	public static void main(String[] args) {
		//new Gotcha().go();
		try { new Gotcha().go(); }
     	catch (Exception e) { System.out.println("ouch"); }     
	}
	void go() {
		go();
	}
}





/*


Exception in thread "main" java.lang.StackOverflowError












*/

