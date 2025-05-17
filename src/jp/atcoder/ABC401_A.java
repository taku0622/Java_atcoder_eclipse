package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC401_A {

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
		aStatusCode(il);
	}
	private static void aStatusCode(ArrayList<Integer> il) {
		int value = il.get(0);
		String ans = "";
		if(value >= 200 && value < 300) {
			ans = "Success";
		} else {
			ans = "Failure";
		}
		System.out.println(ans);
	}
}
