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
	private BigInteger res;
	
	CashFact(){};
	
	CashFact(int n){
		if ( n >= 0 && n <= 20) 
			ComputBigFact(n);
		else System.out.println("Помилка. Вкажіть 0 >= n >= 20"); 
	};
	
	public BigInteger ComputBigFact (int n){
		
			if(counter < n)
				if (n<=1){
				return	cash[n] = BigInteger.valueOf(1);
				}
			return cash[n] = BigInteger.valueOf(n).multiply(ComputBigFact(n-1));	//return n*factRec(n-1) типу BigInteger
			//return cash[n];
			 
	}
	
	
	
	private static void printCashArrey(int[] a) {
		String cashArrey = "";
		for (int i = 0; i < a.length; i++) {
			cashArrey = cashArrey + " " + cash[i];
		}
		System.out.println(cashArrey);
	}
	
	/*
	public CashFact(int n){
		if ( n >= 0 && n <= 20) {
			if(counter < n)
				for (int i = counter; i <= n; i++){
					cash[i] = ComputBigFact (i);
					counter++;
				}
			res = cash[n];
		}
		else System.out.println("Помилка. Вкажіть 0 >= n >= 20");
		
	};
*/
}	

	