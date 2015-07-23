class Dims{
	public static void main(String[] args){
		int[][] a = {{1,2},{3,4}};
		int[] b = (int[])a[1];
		Object o1 =a;
		int[][] a2 = (int[][])o1;
		int[] b2 = (int[]) o1;
		System.out.println(b[1]);
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
