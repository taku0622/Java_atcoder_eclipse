package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC279_A {

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
		ArrayList<String> il = new ArrayList<String>();
		for(String s:sa) {
			il.add(s);
		}
		aWwwvvvvvv(il);
	}
	private static void aWwwvvvvvv(ArrayList<String> il) {
		int sum = 0;
		for(int i=0;i<il.size();i++) {
			sum += il.get(i).equals("w") ? 2 : 1;
		}
		System.out.println(sum);
	}
}
