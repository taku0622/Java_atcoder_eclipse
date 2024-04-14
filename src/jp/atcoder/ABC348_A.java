package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC348_A {

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
		aPenaltyKick(il);
	}
	private static void  aPenaltyKick(ArrayList<Integer> il) {
		String ans ="";
		for(int i = 1; i<il.get(0)+1;i++) { // ooxooxo
			String result = "o";
			if(i % 3 == 0) result = "x";
			ans += result;
		};
		System.out.println(ans);
	}
}