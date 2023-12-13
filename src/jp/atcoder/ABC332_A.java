package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC332_A {
	public static void main(String[] args) {
		String str1;
		int min;
		int addition;
		ArrayList<String> sl = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			String[] sa = str1.split(" ");
			min = Integer.parseInt(sa[1]);
			addition = Integer.parseInt(sa[2]);
			for(int i=0;i<Integer.parseInt(sa[0]);i++) {
				String str = br.readLine();
				sl.add(str);
			}
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		aOnlineShopping(sl, min, addition);
	}
	private static void aOnlineShopping(ArrayList<String> sl, int min, int addition) {
		int sum = 0;
		for(String s : sl) {
			String[] sa = s.split(" ");
			sum += Integer.parseInt(sa[0]) * Integer.parseInt(sa[1]);
		}
		if(sum < min) {
			sum += addition;
		}
		System.out.println(sum);
	}
}
