package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC379_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split("");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		aCyclic(il);
	}
	private static void aCyclic(ArrayList<Integer> il) {
		String a = il.get(0).toString();
		String b = il.get(1).toString();
		String c = il.get(2).toString();
		String ans = b + c + a + " " + c + a + b;
		System.out.println(ans);
	}
}
