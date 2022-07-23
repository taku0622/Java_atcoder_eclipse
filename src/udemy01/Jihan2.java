package udemy01;

import java.util.ArrayList;

public class Jihan2 {

	public static void main(String[] args) {
		ArrayList<Integer> coin = new ArrayList<Integer>();
		coin.add(0);
		coin.add(1);
		coin.add(5);
		coin.add(10);
		coin.add(50);
		coin.add(100);
		coin.add(500);
		String ans = "";
		int sum = 0;
		int pushBotton = Integer.parseInt(args[args.length-1]);
		args[args.length-1] = "0";
		for(String s : args) {
			int c = Integer.parseInt(s);
			if(c == 1 || c == 5) {
				ans += "waring:no use " + c + " coin\n";
			}else if(!coin.contains(c)) {
				ans += "waring:" + c + "coin is invalid\n";
			} else {
				sum += c;
			}
		}
		System.out.print(ans);
		System.out.println("sum : " + sum);
		System.out.println("rest : " + (sum - pushBotton) );
	}

}
