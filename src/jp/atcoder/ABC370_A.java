package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC370_A {

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
		aRaiseBothHands(il);
	}
	private static void aRaiseBothHands(ArrayList<Integer> il) {
		int a = il.get(0);
		int b = il.get(1);
		String ans = "Invalid";
		if(a > b) {
			ans ="Yes";
		}
		if(a < b) {
			ans ="No";
		}

		System.out.println(ans);
	}
}
