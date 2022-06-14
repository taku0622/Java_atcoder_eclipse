package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC255_A {

	public static void main(String[] args) {
		String str1;
		String str2;
		String str3;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			str2 = br.readLine();
			str3 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] a1 = str1.split(" ");
		String[] a2 = str2.split(" ");
		String[] a3 = str3.split(" ");
		String[] sa = new String[6];
		sa[0] = a1[0];
		sa[1] = a1[1];
		sa[2] = a2[0];
		sa[3] = a2[1];
		sa[4] = a3[0];
		sa[5] = a3[1];
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		lastTwoDigits(il);
	}
	private static void lastTwoDigits(ArrayList<Integer> il) {
		System.out.println("" + il.get(1) + il.get(2));
	}
}
