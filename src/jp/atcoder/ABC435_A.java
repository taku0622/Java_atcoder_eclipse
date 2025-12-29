package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC435_A {

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
		aTriangularNumber(il);
	}
	private static void aTriangularNumber(ArrayList<Integer> il) {
		int n = il.get(0);
		int ans = 0;
		for(int i=0; i <= n; i++) {
			ans += i;
		}
		System.out.println(ans);
	}
}
