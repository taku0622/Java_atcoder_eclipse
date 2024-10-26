package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC377_A {

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
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		aRearrangingABC(sl);
	}
	private static void aRearrangingABC(ArrayList<String> sl) {
		boolean a = false;
		boolean b = false;
		boolean c = false;
		for(String s : sl) {
			switch(s) {
			case "A":
				a = true;
				break;
			case "B":
				b = true;
				break;
			case "C":
				c = true;
				break;
			}
		}
		if(a && b && c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
