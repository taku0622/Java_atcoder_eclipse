package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC245_A {

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
		goodMorning(il);
	}
	private static void goodMorning(ArrayList<Integer> il) {
		ArrayList<String> sl = new ArrayList<String>();
		for(int i:il) {
			sl.add(String.format("%02d", i));
		}
		int a = Integer.parseInt(sl.get(0) + sl.get(1));
		int b = Integer.parseInt(sl.get(2) + sl.get(3));

		String ans = a <= b ? "Takahashi" : "Aoki";
		System.out.println(ans);
	}
}
