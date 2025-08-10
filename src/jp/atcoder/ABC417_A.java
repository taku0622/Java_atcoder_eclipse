package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC417_A {

	public static void main(String[] args) {
		String str1;
		String str2;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			str2 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split(" ");
		ArrayList<Integer> il1 = new ArrayList<Integer>();
		for(String s:sa) {
			il1.add(Integer.parseInt(s));
		}
		String[] sa2 = str2.split("");
		ArrayList<String> sl1 = new ArrayList<String>();
		for(String s:sa2) {
			sl1.add(s);
		}
		aSubstring(il1, sl1);
	}
	private static void  aSubstring(ArrayList<Integer> il1, ArrayList<String> sl1) {
		int b = il1.get(0) - il1.get(2);
		String ans = "";
		for(int i=il1.get(1); i < b; i++) {
			ans += sl1.get(i);
		}
		System.out.println(ans);
	}
}