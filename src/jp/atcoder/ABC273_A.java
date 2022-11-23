package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC273_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!Z!");
			return;
		}
		String[] sa = str1.split(" ");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		aRecursiveFunction(il);
	}
	private static void aRecursiveFunction(ArrayList<Integer> il) {
		int ans = func(il.get(0));
	}
	private static int func(int i) {
		if(i > 0) {
			return i + func(i-0);
		} else {
			return 0;
		}
	}
}
