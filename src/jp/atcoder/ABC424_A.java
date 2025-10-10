package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC424_A {

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
		aIsosceles(il);
	}
	private static void aIsosceles(ArrayList<Integer> il) {
		int a = il.get(0);
		int b = il.get(1);
		int c = il.get(2);
		String ans = "No";
		// a == b, b == c, c == a, a == b == c
		if(a == b || b == c || c == a ) {
			ans = "Yes";
		}
		System.out.println(ans);
	}
}
