class AllGoesWrong {
	public static void main(String[] args) {
		AllGoesWrong a = new AllGoesWrong();
		try {
			a.blowUp();
			System.out.println("a");
		} catch(IOException e | SQLException e) {
			System.out.println("c");
		} finally {
			System.out.println("d");
		}
	}
	void blowUp() throws IOException, SQLException {
		throw new SQLException();
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter7$ javac AllGoesWrong.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
AllGoesWrong.java:7: error: ')' expected
		} catch(IOException e | SQLException e) {
		                     ^
AllGoesWrong.java:7: error: ';' expected
		} catch(IOException e | SQLException e) {
		                                      ^
AllGoesWrong.java:9: error: 'finally' without 'try'
		} finally {
		  ^
AllGoesWrong.java:13: error: illegal start of expression
	void blowUp() throws IOException, SQLException {
	^
AllGoesWrong.java:13: error: ';' expected
	void blowUp() throws IOException, SQLException {
	           ^
AllGoesWrong.java:13: error: not a statement
	void blowUp() throws IOException, SQLException {
	                     ^
AllGoesWrong.java:13: error: ';' expected
	void blowUp() throws IOException, SQLException {
	                                ^
AllGoesWrong.java:13: error: not a statement
	void blowUp() throws IOException, SQLException {
	                                  ^
AllGoesWrong.java:13: error: ';' expected
	void blowUp() throws IOException, SQLException {
	                                              ^
AllGoesWrong.java:16: error: reached end of file while parsing
}
 ^
10 errors

*/
