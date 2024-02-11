package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC340_A {

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
		aArithmeticProgression(il);
	}
	private static void  aArithmeticProgression(ArrayList<Integer> il) {
		int a = il.get(0);
		int b = il.get(1);;
		int d = il.get(2);
		String ans = "";
		for(int i=a;;i+=d) {
			ans += i + " ";
			if(i==b) break;
		}
		System.out.println(ans);
	}
}