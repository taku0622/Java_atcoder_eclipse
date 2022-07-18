package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class ABC260_A {

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
		ArrayList<String> il = new ArrayList<String>();
		for(String s:sa) {
			il.add(s);
		}
		aUniqueLetter(il);
	}
	private static void aUniqueLetter(ArrayList<String> il) {
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		for(String s:il) {
			if(hMap.containsKey(s)) {
				int i = hMap.get(s);
				hMap.put(s, ++i);
			}else {
				hMap.put(s,1);
			}
		}
//		System.out.println(hMap);
		for(String s:il) {
			if(hMap.get(s).equals(1)) {
				System.out.println(s);
				return;
			}
		}
		System.out.println(-1);
	}
}
