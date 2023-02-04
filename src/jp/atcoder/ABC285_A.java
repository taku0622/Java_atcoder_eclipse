package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC285_A {

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
		aEdgeChecker2(il);
	}
	private static void aEdgeChecker2(ArrayList<Integer> il) {
		String ans = "No";
		if(il.get(0)*2 == il.get(1) || il.get(0)*2+1 == il.get(1)) {
			ans = "Yes";
		}
		System.out.println(ans);
	}
}
