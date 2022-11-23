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
	// f(k)=k×f(k−1)
	private static void aRecursiveFunction(ArrayList<Integer> il) {
		int ans = 1;
		for(int i = il.get(0); i > 0;i--) {
			ans *= i;
		}
		System.out.println(ans);
	}
}
