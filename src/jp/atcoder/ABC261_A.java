package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC261_A {

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
		intersection(il);
	}
	private static void intersection(ArrayList<Integer> il) {
		int l1 = il.get(0);
		int r1 = il.get(1);
		int l2 = il.get(2);
		int r2 = il.get(3);
		int ans = 0;
		// r1 <= l2 → 0 || r2 <= l1 → 0
		if(r1 <= l2 || r2 <= l1) {
			ans = 0;
		}else if(l2 < r1 && l1 <= l2 && r1 <= r2) { // l2 < r1 && l1 <= l2 && r1 <= r2
			ans = r1 - l2;
		}else if(l2 < r1 && l1 <= l2 && r2 <= r1) {
			ans = r2 - l2;
		}else if(l2 < l1 && r1 <= r2 ) {
			ans = r1 - l1;
		}else if(l2 < l1 && r2 < r1) {
			ans = r2 - l1;
		}

		System.out.println(ans);
	}
}
