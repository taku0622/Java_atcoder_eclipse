package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ABC267_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		aSaturday(str1);
	}
	private static void aSaturday(String str1) {
		HashMap<String, Integer> hm = new java.util.HashMap<String, Integer>();
		hm.put("Monday", 5);
		hm.put("Tuesday", 4);
		hm.put("Wednesday", 3);
		hm.put("Thursday", 2);
		hm.put("Friday", 1);
		System.out.println(hm.get(str1));
	}
}
