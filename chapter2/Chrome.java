class X { void do1() { }}
class Y extends X { void do2() {} }

class Chrome {
	public static void main( String[] args) {
		X x1= new X();
		X x2 = new Y();
		Y y1 = new Y();
		// insert code here
		//x2.do2();//willnot compile
		//(Y)x2.do2()//willnot compile
		((Y)x2).do2();// This will compile
	}
}
