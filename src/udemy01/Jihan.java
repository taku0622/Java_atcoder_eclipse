package udemy01;

import java.util.ArrayList;

public class Jihan {

	public static void main(String[] args) {
		ArrayList<Integer> coin = new ArrayList<Integer>();
		coin.add(1);
		coin.add(5);
		coin.add(10);
		coin.add(50);
		coin.add(100);
		coin.add(500);
		String ans = "";
		int sum = 0;
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
		System.out.print("sum : " + sum);

	}

}
