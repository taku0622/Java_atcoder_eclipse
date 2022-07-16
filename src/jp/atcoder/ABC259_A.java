package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC259_A {

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
		growthRecord(il);
	}
	private static void growthRecord(ArrayList<Integer> il) {
		int n = il.get(0);
		int m = il.get(1);
		int x = il.get(2);
		int t = il.get(3);
		int d = il.get(4);
		int ans = 0;
		if(n >= m && m >= x) {
			ans = t;
		}else {
			ans = t - ((x-m) * d);
		}
		System.out.println(ans);
	}
}
