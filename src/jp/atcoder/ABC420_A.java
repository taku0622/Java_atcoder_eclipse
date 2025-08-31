package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC420_A {

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
		aWhatMonthIsIt(il);
	}
	private static void aWhatMonthIsIt(ArrayList<Integer> il) {
		int x = il.get(0);
		int y = il.get(1);
		int r = (x + y) % 12;
		if(r == 0) r = 12;
		System.out.println(r);
	}
}
