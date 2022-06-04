package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC253_A {

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
		median(il);
	}
	private static void median(ArrayList<Integer> il) {
		int a = il.get(0);
		int b = il.get(1);
		int c = il.get(2);
		boolean asc = a <= b && b <= c ? true : false;
		boolean desc = c <= b && b <= a ? true : false;
		String ans = asc || desc ? "Yes" : "No";
		System.out.println(ans);
	}
}
