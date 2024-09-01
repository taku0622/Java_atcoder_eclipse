package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC369_A {

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
		a369(il);
	}
	private static void a369(ArrayList<Integer> il) {
		int a = il.get(0);
		int b = il.get(1);
		int sub = Math.abs(a-b);
		int ans = 3;
		// 3 3 3
		if(a == b) {
			ans = 1;
		}else if(sub % 2 == 1 ) {
			ans = 2;
		}
		System.out.println(ans);
	}
}
