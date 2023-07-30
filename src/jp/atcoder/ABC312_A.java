package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC312_A {

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
		aChord(sl);
	}
	private static void  aChord(ArrayList<String> sl) {
		String ans = "No";
		switch(sl.get(0)) {
		case "ACE":
		case "BDF":
		case "CEG":
		case "DFA":
		case "EGB":
		case "FAC":
		case "GBD":
			ans = "Yes";
			break;
		}
		System.out.println(ans);
	}
}