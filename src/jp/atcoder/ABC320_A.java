package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC320_A {

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
		aLeylandNumber(il);
	}
	private static void  aLeylandNumber(ArrayList<Integer> il) {
		double a = il.get(0);
		double b = il.get(1);
		int ans = (int)(Math.pow(a, b)+Math.pow(b, a));
		System.out.println(ans);
	}
}