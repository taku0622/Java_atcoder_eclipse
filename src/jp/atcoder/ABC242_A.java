package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC242_A {

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
		tShirt(il);

	}
	private static void tShirt(ArrayList<Integer> il) {
		double ans;
		if(il.get(0) >= il.get(3)) {
			ans = 1.0;
		}else if (il.get(3) > il.get(1)) {
			ans = 0.0;
		}else {
			double a = il.get(2);
			double b = il.get(1) - il.get(0);
			ans = a/b;
		}
		System.out.println(ans);
	}
}
