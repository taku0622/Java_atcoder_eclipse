package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC419_A {

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
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		aAtCoderLanguage(sl);
	}
	private static void aAtCoderLanguage(ArrayList<String> sl) {
		String ans = "Unknown";
		if(sl.get(0).equals("red")) ans = "SSS";
		if(sl.get(0).equals("blue")) ans = "FFF";
		if(sl.get(0).equals("green")) ans = "MMM";
		System.out.println(ans);
	}
}
