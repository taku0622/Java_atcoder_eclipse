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
		String anString = "";
		int count = 0;
		for(int i = 0;i < abcStrings.length;i++) {
			for(int j = 0;j < il.get(0);j++) {
				anString += abcStrings[0];
				count++;
				if(count==il.get(1)) {
					System.out.println(abcStrings[i]);
					// System.out.println(anString);
				}
			}
		}
	}
}
