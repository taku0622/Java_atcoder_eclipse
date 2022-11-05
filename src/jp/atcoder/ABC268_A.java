package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class ABC268_A {

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
		ArrayList<String> il = new ArrayList<String>();
		for(String s:sa) {
			il.add(s);
		}
		aFiveIntegers(il);
	}
	private static void aFiveIntegers(ArrayList<String> il) {
		HashSet<String> hs = new HashSet<String>();
		hs.add(" ");
		for(String string : il) {
			hs.add(string);
		}
		hs.remove(" ");
		System.out.println(hs.size());
	}
}
