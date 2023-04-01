package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC295_A {

	public static void main(String[] args) {
		String str1;
		String str2;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			str2 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split(" ");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		String[] sa2 = str2.split(" ");
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa2) {
			sl.add(s);
		}
		aProbablyEnglish(il, sl);
	}
	private static void aProbablyEnglish(ArrayList<Integer> il,ArrayList<String> sl) {
		String[] arr = { "and", "not", "that", "the", "you" };
		for(String s : sl) {
			for(String t : arr) {
				if(s.equals(t)) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
