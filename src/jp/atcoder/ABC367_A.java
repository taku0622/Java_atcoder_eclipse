package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC367_A {

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
		aShoutEveryday(il);
	}
	private static void aShoutEveryday(ArrayList<Integer> il) {
		int a = il.get(0);
		int b = il.get(1);
		int c = il.get(2);
		// 8 14
		if(b < c) {
			// 21 8 14 || 3 8 14
			if((a > b && a > c) || (a < b && a < c)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			// // 8 21 7 || 20 21 7
			if(a < b && a > c) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
