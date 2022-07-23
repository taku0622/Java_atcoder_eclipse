package udemy01;
class Ex1_12_2 {
	public static void main (String[] args) {

		int receiveNumber = Integer.parseInt(args[0]) ;
		int calcNumber    = receiveNumber ;
		if(receiveNumber < 2) {
			System.out.println("illegal number!!");
			return;
		}
		while( calcNumber < 100 ){

			System.out.println("calcNumber:" + calcNumber);

			calcNumber *= receiveNumber ;

		}

	}
}
