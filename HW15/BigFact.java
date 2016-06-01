package part2.practice.HW15;

import java.math.*;

public class BigFact {

	public BigInteger ComputBigFact (int n){
		if (n<=1)
			return BigInteger.valueOf(1);
		return BigInteger.valueOf(n).multiply(ComputBigFact(n-1));	//return n*factRec(n-1) типу BigInteger
	}
}

/*
class CashFact {
	private static	int [] cash = new int[20];
	static private int counter;
	
	CashFact(){};
	
	public CashFact(int n){
		
	};

}	
*/
	