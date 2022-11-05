package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC271_A {

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
		a484558(il);
	}
	private static void a484558(ArrayList<Integer> il) {
		String s16 = Integer.toHexString(il.get(0));
		String s16Upper = s16.toUpperCase();
		s16Upper = s16Upper.length() == 1 ? "0" + s16Upper : s16Upper;
		System.out.println(s16Upper);
	}
}
