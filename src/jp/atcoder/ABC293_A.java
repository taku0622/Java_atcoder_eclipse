package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC293_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		char[] ca = str1.toCharArray();
		ArrayList<Character> cl = new ArrayList<Character>();
		for(char c:ca) {
			cl.add(c);
		}
		aSwapOddandEven(cl);
	}
	private static void aSwapOddandEven(ArrayList<Character> cl) {
		String ans = "";
		for(int i = 0; i < cl.size()-1; i+=2) {
//			System.out.println(i);
			ans += cl.get(i+1);
			ans += cl.get(i);
		}
		System.out.println(ans);
	}
}
