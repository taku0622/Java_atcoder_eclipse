package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC405_A {

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
		aIsitrated(il);
	}
	private static void aIsitrated(ArrayList<Integer> il) {
		int rate = il.get(0);
		int level = il.get(1);
		String ans = "";
		if(level == 1 && (rate >= 1600 && rate < 3000)) {
			ans = "Yes";
		} else if(level == 2 && (rate >= 1200 && rate < 2400)) {
			ans = "Yes";
		} else {
			ans ="No";
		}
		System.out.println(ans);
	}
}
