package part2.practice.HW15;

import java.math.*;

class BigFact {

	public BigInteger ComputBigFact (int n){
		if (n<=1)
			return BigInteger.valueOf(1);
		return BigInteger.valueOf(n).multiply(ComputBigFact(n-1));	//return n*factRec(n-1) типу BigInteger
	}

}


class CashFact extends BigFact{
	static	BigInteger [] cash = new BigInteger[21];
	static private int counter=0;
	
	CashFact(){};
	
	CashFact(int n){
		if ( n >= 0 && n <= 20) {
			ComputBigFact(n);
			System.out.println(n + "! = " + cash[n]);
		}
		else System.out.println("Помилка. Вкажіть 0 >= n >= 20"); 
	};
	
		
	public BigInteger ComputBigFact (int n){
		if ( n >= 0 && n <= 20) {
			if(counter < n)
				if (n<=1){
					return	cash[n] = BigInteger.valueOf(1);
				}
			return cash[n] = BigInteger.valueOf(n).multiply(ComputBigFact(n-1));	//return n*factRec(n-1) типу BigInteger
		
		}
		else {
			System.out.println("Помилка. Вкажіть 0 >= n >= 20");
			return null;
		}
	}
	
		
	
	public void printCashArrey() {
		String cashArrey="";
		for (int i = 0; i < cash.length; i++) {
			cashArrey = cashArrey + cash[i]+" ";
		}
		System.out.println(cashArrey);
	}
	
}
	