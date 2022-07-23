package udemy01;
public class Ex1_14_2 {

	public static void main (String[] args) {

		int totalPrice = 0 ;
		for(int i = 0 ; i < args.length ; i++ ){
			totalPrice += Integer.parseInt( args[i] );
		}

		int discountedPrice = discount( totalPrice );
		int taxPayment = calcTaxPayment( discountedPrice );

		System.out.println("price:" + taxPayment + "yen" );

	}

	static int calcTaxPayment(int discountedPrice){
		return (int)Math.floor(discountedPrice * 1.08);
	}


	static int discount( int totalPrice ){
		double per = 0;
		int max = 0;
		if(totalPrice >= 5000) {
			per = 0.2;
		}else if (totalPrice >= 1000) {
			per = 0.1;
		}
		max = (int)Math.floor(totalPrice*per);
		if(max > 5000) max = 5000;
		return totalPrice - max;
	}
}
