package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC258_A {

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
		When(il);
	}
	private static void When(ArrayList<Integer> il) {
		int hour = 21;
		int min = il.get(0);
		if(il.get(0) >= 60) {
			hour += 1;
			min = il.get(0) - 60;
		}
		String ans = hour + ":" + String.format("%02d",min);
		System.out.println(ans);
	}
}
