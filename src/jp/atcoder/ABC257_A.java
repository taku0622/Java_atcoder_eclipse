package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC257_A {

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
		AtoZString2(il);
	}
	private static void AtoZString2(ArrayList<Integer> il) {
		String abcString ="ABCDEFGHIJKLMNOPQRSYUVWXYZ";
		String[] abcStrings = abcString.split("");
		System.out.println(abcStrings.length);
	}
}
