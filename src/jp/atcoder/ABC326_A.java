package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC326_A {

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
		a2UP3DOWN(il);
	}
	private static void  a2UP3DOWN(ArrayList<Integer> il) {
		int x = il.get(0);
		int y = il.get(1);
		if((x > y && x - y < 4) || (y > x && y - x < 3)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}