package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC248_B {
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
		slimes(il);
	}
	private static void slimes(ArrayList<Integer> il) {
		int a = il.get(0);
		int b = il.get(1);
		int k = il.get(2);
		int ans = 0;
		if(a >= b) {
			System.out.println(ans);
			return;
		}
		ans++;
		for(;;ans++) {
			if(a * Math.pow(k, ans) >= b) {
				System.out.println(ans);
				return;
			}
		}
	}
}
