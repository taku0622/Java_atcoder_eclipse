package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC278_A {

	public static void main(String[] args) {
		String str1;
		String str2;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			str2 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		str2 += " " + str1;
		String[] sa = str2.split(" ");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		aShift(il);
	}
	private static void aShift(ArrayList<Integer> il) {
		int num = il.get(il.size() - 1);
		il.remove(il.size() - 1);
		il.remove(il.size() - 1);
		for(int i=0;i<num;i++) {
			il.remove(0);
			il.add(0);
		}
		String ans = "";
		for(int i:il) {
			ans += i + " ";
		}
		System.out.println(ans);
	}
}
