package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC445_A {

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
		aStrongWord(sl);
	}
	private static void aStrongWord(ArrayList<String> sl) {
		String ans = "No";
		if(sl.get(0).equals(sl.get(sl.size()-1))) {
			ans = "Yes";
		}
		System.out.println(ans);
	}
}
