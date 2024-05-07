package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC352_A {

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
		aAtCoderLine(il);
	}
	private static void  aAtCoderLine(ArrayList<Integer> il) {
		String ans = "Yes";
		int top = 100;
		int bottom = 0;
		if(il.get(1) > il.get(2)) {
			top = il.get(1);
			bottom = il.get(2);
		}else {
			top = il.get(2);
			bottom = il.get(1);
		}
		ans = (top > il.get(3) && bottom < il.get(3)) ? "Yes" : "No";
		System.out.println(ans);
	}
}