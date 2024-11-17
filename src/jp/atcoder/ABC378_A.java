package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC378_A {

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
		aPairing(il);
	}
	private static void aPairing(ArrayList<Integer> il) {
		int ans = 0;
		for(int i=0;i<4;i++) {
			int count = 0;
			for(int j : il) {
				if(j == i+1) {
					count++;
				}
			}
			ans += count / 2;
		}
		System.out.println(ans);
	}
}
