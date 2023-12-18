package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC333_A {

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
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		aThreeThrees(il);
	}
	private static void  aThreeThrees(ArrayList<Integer> il) {
		String ans = "";
		for(int i=0;i<il.get(0);i++) {
			ans += "" + il.get(0);
		}
		System.out.println(ans);
	}
}