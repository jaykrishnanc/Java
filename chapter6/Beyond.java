class Infinity{}
public class Beyond extends Infinity {
	static Integer i;
	public static void main(String[] args) {
		int sw = (int)(Math.random() * 3);
		switch(sw) {
			case 0: { for(int x =10; x > 5; x++)
						if(x>10000000) x = 10;
					break; }
			case 1: { int y = 7 * i; break; }
			case 2: { Infinity inf = new Beyond();
					  Beyond b = (Beyond)inf; }
		}
	}
}

/*

i was not initialized, case 1 will throw a NullPointerException. Case 0 will initiate an endless loop, not a stack overflow. Case 2's downcast will not cause an exception

*/
