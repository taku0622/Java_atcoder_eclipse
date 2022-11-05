package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC265_A {

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
		aApple(il);
	}
	private static void aApple(ArrayList<Integer> il) {
		int x = il.get(0);
		int y = il.get(1);
		int n = il.get(2);
		// 1
		int ans1 = x * n;
		// 3
		int ans2 = ans1 + 1;
		if(n >= 3) {
			ans2 = ((n / 3) * y) + ((n % 3) * x);
		}
		// compare
		int ans = ans1 < ans2 ? ans1 : ans2;
		System.out.println(ans);
	}
}
