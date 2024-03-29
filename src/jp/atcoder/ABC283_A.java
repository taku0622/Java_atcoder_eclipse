package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC283_A {

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
		aPower (il);
	}
	private static void aPower (ArrayList<Integer> il) {
		int ans = 1;
		int a = il.get(0);
		int b = il.get(1);
		for(int i=0;i<b;i++) {
			ans *= a;
		}
		System.out.println(ans);
	}
}
