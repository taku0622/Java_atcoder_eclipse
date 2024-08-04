package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC365_A {

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
		aLeapYear(il);
	}
	private static void aLeapYear(ArrayList<Integer> il) {
		int value = il.get(0);
		String ans = "365";
		if(value % 4 == 0 && value % 100 != 0) {
			ans = "366";
		} else if(value % 400 == 0) {
			ans = "366";
		}
		System.out.println(ans);
	}
}
