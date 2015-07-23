public class Mounds {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String s = new String();
		for(int i = 0; i < 1000; i++) {
			s = " " + i;
			sb.append(s);
		}
			// done with loop
	}
}

/*

About 1000 is correct. StringBuilders are mutable, so all of the append() invocations are acting upon the same StringBuilder object over and over. Strings, however, are immutable, so every String concatenation operation results in a new String object. Also, the string " " is created once and reused in every loop iteration.
*/
