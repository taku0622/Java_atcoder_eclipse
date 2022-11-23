package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC274_A {

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
		aBattingAverage(il);
	}
	private static void aBattingAverage(ArrayList<Integer> il) {
		double value = (double)Math.round((((double)il.get(1) / il.get(0)) * 1000));
		String ans = String.format("%.3f", value/1000);
		System.out.println(ans);
	}
}
