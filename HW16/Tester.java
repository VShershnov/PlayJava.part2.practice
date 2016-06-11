package part2.practice.HW16;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigFact n = new BigFact();
		System.out.println("20! = " + n.ComputBigFact(20));
		
		CashFact m = new CashFact(15);
		m.printCashArrey();
		
		CashFact m1 = new CashFact();

		System.out.println("4! = " + m1.ComputBigFact(4));
		m1.printCashArrey();
		System.out.println("16! = " + m1.ComputBigFact(16));
		m1.printCashArrey();
		System.out.println("17! = " + m1.ComputBigFact(17));
		m1.printCashArrey();
		System.out.println("19! = " + m1.ComputBigFact(19));
		m1.printCashArrey();
		System.out.println("20! = " + m1.ComputBigFact(20));
		m1.printCashArrey();
		System.out.println("21! = " + m1.ComputBigFact(21));
		m1.printCashArrey();
	}

}
