class BadIO {
	public static void main (String[] args) {
		BadIO a = new BadIO();
		try {
			a.fileBlowUp();
			a.databaseBlowUp();
			System.out.println("a");
		}
		// insert code here 
		//catch(Exception e) { // will not compile
		//catch(FileNotFoundException e) { // will not compile
		//catch(IOException e) { // This Will Compile
		//catch(IOException | SQLException e) { // This Will Compile
		//catch(IOException e | SQLException e) { // This will Compile
		//catch(SQLException e) { //will not compile
		//catch(SQLException | IOException e) { // This Will Compile
		//catch(SQLException e | IOException e) { // will not Compile
			System.out.println("b");
		}
		catch (Exception e) {
			System.out.println("c");
		}
	}
	void databaseBlowUp() throws SQLException {
		throw new SQLException();
	}
	void fileBlowUp() throws IOException {
		throw new IOException();
	}
}
