class Train {
	class RanOutOfTrack extends Exception { }
	class AnotherTrainComing extends Exception { }

	public static void main ( String[] args) throws RanOutOfTrack, AnotherTrainComing {
		Train a =new Train();
		try {
			a.drive();
			System.out.println("honk! honk!");
		}// insert code here
		//catch(AnotherTrainComing e) {//Exception in runtime
		//catch(AnotherTrainComing | RanOutOfTrack e) {//Will produce "Error Driving" and a runtime Excetion
		//catch(AnotherTrainComing e | RanOutOfTrack e) {//Will not Compile
		//catch(Exception e) {//Will produce "Error Driving" and a runtime Excetion
		//catch(IllegalArgumentException e) {//Exception in runtime
		catch(RanOutOfTrack e) {//Will produce "Error Driving" and a runtime Excetion
			System.out.println("Error Driving");
			throw e;
		}
	}
	void drive() throws RanOutOfTrack, AnotherTrainComing {
		throw new RanOutOfTrack();
	}
}
