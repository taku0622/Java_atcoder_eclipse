package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC411_A {

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
		String[] sa = str1.split("");
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		String[] sa2 = str2.split(" ");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa2) {
			il.add(Integer.parseInt(s));
		}
		aRequiredLength(sl, il);
	}
	private static void  aRequiredLength(ArrayList<String> sl, ArrayList<Integer> il) {
		String ans = "No";
		if(sl.size() >= il.get(0)) {
			ans = "Yes";
		}
		System.out.println(ans);
	}
}