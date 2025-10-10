package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC425_A {

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
		aSigmaCubes(il);
	}
	private static void aSigmaCubes(ArrayList<Integer> il) {
		int ans = 0;
		double value = 0;
		for(int i = 1; i <= il.get(0); i++) {
			value +=  Math.pow(-1, i) *Math.pow(i, 3);
		}
		ans += value;
		System.out.println(ans);
	}
}
