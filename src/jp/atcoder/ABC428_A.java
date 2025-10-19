package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC428_A {

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
		aGrandmaFootsteps(il);
	}
	private static void aGrandmaFootsteps(ArrayList<Integer> il) {
		int ans = 0;
		int s = il.get(0);
		int a = il.get(1);
		int b = il.get(2);
		int x = il.get(3);
		for(;;) {
			if (x - a  < 0) {
				int r = x % a;
				ans += r * s;
				break;
			} else {
				x -= a;
				ans += a * s;
			}
//			System.out.println("x1 :" + x);
			x -= b;
			if (x < 0) {
				break;
			}
		}
		System.out.println(ans);
//		System.out.println("x2 :" + x);
	}
}
