package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ABC432_A {

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
		aPermutetoMaximize(il);
	}
	private static void aPermutetoMaximize(ArrayList<Integer> il) {
		Collections.sort(il, Collections.reverseOrder());
		String ans = il.get(0) + "" + il.get(1) + "" + il.get(2);
		System.out.println(ans);
	}
}
