package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC400_A {

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
		aABC400Party(il);
	}
	private static void aABC400Party(ArrayList<Integer> il) {
		int value = il.get(0);
		int ans = 0;
		if(400 % value != 0) {
			ans = -1;
		} else {
			ans = 400 / value;
		}
		System.out.println(ans);
	}
}
