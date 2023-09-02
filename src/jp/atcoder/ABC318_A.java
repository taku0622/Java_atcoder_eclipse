package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC318_A {

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
		aFullMoon(il);
	}
	private static void  aFullMoon(ArrayList<Integer> il) {
		int n = il.get(0);
		int m = il.get(1);
		int p = il.get(2);
		if(n<m) {
			System.out.println(0);
			return;
		}
		System.out.println((n-m)/p+1);
	}
}