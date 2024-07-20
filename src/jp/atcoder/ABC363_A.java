package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC363_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split(" ");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		aPilingUp(il);
	}
	private static void aPilingUp(ArrayList<Integer> il) {
		int rate = il.get(0);
		int ans = 0;
		if(rate < 100) {
			ans = 100 - rate;
		} else if(rate < 200) {
			ans = 200 - rate;
		} else if(rate < 300) {
			ans = 300 - rate;
		}
		System.out.println(ans);
	}
}
