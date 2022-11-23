package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC276_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!Z!");
			return;
		}
		String[] sa = str1.split("");
		ArrayList<String> il = new ArrayList<String>();
		for(String s:sa) {
			il.add(s);
		}
		aRightmost(il);
	}
	private static void aRightmost(ArrayList<String> il) {
		int num = -1;
		for(int i=0;i<il.size();i++) {
//			System.out.println(il.get(i));
			if(il.get(i).equals("a")) {
				num = i+1;
			}
		}
		System.out.println(num);
	}
}
