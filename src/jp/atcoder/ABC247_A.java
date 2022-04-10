package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC247_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split("");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		moveRight(il);
	}
	private static void moveRight(ArrayList<Integer> il) {
		il.add(0);
		for(int i=4;i>0;i--) {
			il.set(i,il.get(i-1));
		}
		il.remove(4);
		il.set(0, 0);
		String ans = "";
		for(int i:il) {
			ans += String.valueOf(i);
		}
		System.out.println(ans);
	}
}
