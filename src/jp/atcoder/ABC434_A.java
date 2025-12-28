package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC434_A {

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
		aBalloonTrip(il);
	}
	private static void aBalloonTrip(ArrayList<Integer> il) {
		double w = il.get(0) * 1000;
		double b = il.get(1);
		int ans = 0;
		ans = (int)(w / b + 1);
		System.out.println(ans);
	}
}
