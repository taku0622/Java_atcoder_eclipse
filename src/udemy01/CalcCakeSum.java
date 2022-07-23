package udemy01;

import java.util.HashMap;

public class CalcCakeSum {

	public static void main(String[] args) {
		HashMap<Integer, Integer> cakes = new HashMap<Integer, Integer>();
		cakes.put(1,320);
		cakes.put(2,350);
		cakes.put(3,370);
		cakes.put(4,400);
		cakes.put(5,300);
		int sum = 0;
		int count = 0;
		for(int i = 0;i<args.length;i+=2) {
			int x = Integer.parseInt(args[i]);
			int y = Integer.parseInt(args[i+1]);
//			System.out.println(x);
//			System.out.println(y);
			sum += cakes.get(x) * y;
//			System.out.println(sum);
			count++;
		}
//		System.out.println(sum);
//		System.out.println(count);
		if(sum >= 1000) {
			System.out.println(sum*0.2);
			sum -= sum*0.2;
		}
		System.out.println("sum : " + (int)Math.floor((sum)*1.08));
	}

}
