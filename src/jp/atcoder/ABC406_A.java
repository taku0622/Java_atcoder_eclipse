package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC406_A {

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
		aNotAcceptable(il);
	}
	private static void aNotAcceptable(ArrayList<Integer> il) {
		String b = String.format("%02d", il.get(1));
		String d = String.format("%02d", il.get(3));
		int borderTime = Integer.parseInt(il.get(0) + b);
		int submittedTime = Integer.parseInt(il.get(2) + d);
		String ans = borderTime > submittedTime ? "Yes" : "No";
		System.out.println(ans);
	}
}
