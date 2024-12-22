package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC385_A {

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
		aEqually(il);
	}
	private static void aEqually(ArrayList<Integer> il) {
		int a = il.get(0);
		int b = il.get(1);
		int c = il.get(2);
		if(a == b && b == c) {
			System.out.println("Yes");
		} else if(a + b == c || b + c == a || c + a == b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
