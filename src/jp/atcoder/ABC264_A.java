package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC264_A {

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
		subString(il);
	}
	private static void subString(ArrayList<Integer> il) {
		String atcoderString = "atcoder";
		System.out.println(atcoderString.substring(il.get(0)-1, il.get(1)));
	}
}
