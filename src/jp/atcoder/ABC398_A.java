package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC398_A {

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
		aDoorsintheCenter(il);
	}
	private static void aDoorsintheCenter(ArrayList<Integer> il) {
		String ans = "";
		double v = il.get(0);
		int border = (int)v / 2;
		boolean odd = v % 2 == 1;
		if(odd) border++;
		if(odd) {
			for(int i = 0; i < il.get(0); i++) {
				if(i == border-1) {
					ans += "=";
				} else {
					ans += "-";
				}
			}
		}else {
			for(int i = 0; i < il.get(0); i++) {
				if(i == border-1 || i == border) {
					ans += "=";
				} else {
					ans += "-";
				}
			}
		}
		System.out.println(ans);
	}
}
