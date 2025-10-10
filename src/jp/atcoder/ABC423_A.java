package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC423_A {

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
		aScaryFee(il);
	}
	private static void aScaryFee(ArrayList<Integer> il) {
		long x = il.get(0);
		long y = il.get(1);
		// ans + ans y /1000 <= x
		// 1000ans + ans y <= 1000x
		// ans(1000 + y) <= 1000x
		// ans <= 1000x /(1000 + y)
		long ans = (1000 * x) / (1000 + y);
		ans /= 1000;
		ans *= 1000;
		System.out.println(ans);
	}
}
