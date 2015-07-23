public class Actors{
	public static void main(String[] args){
		char[] ca = {0x4e,\u004e,78};
		System.out.println(ca[0] == ca[1] + " " + (ca[0] == ca[2]));
	}
}


/*
Actors.java:3: error: cannot find symbol
		char[] ca = {0x4e,\u004e,78};
		                       ^
  symbol:   variable N
  location: class Actors
Actors.java:4: error: incomparable types: char and String
		System.out.println(ca[0] == ca[1] + " " + (ca[0] == ca[2]));
		                         ^
2 errors
*/
