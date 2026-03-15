package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC449_A {

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
		aSeats2(il);
	}
	private static void aSeats2(ArrayList<Integer> il) {
		int n = il.get(0) % 2 != 0 ? il.get(0) + 1 : il.get(0);
		int m = il.get(1);

		String ans = n / 2 >= m ? "Yes" : "No";
		System.out.println(ans);
	}
}
