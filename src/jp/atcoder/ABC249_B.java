package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ABC249_B {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		char[] ca = str1.toCharArray();

		perfectString(ca);
	}
	private static void perfectString(char[] ca) {
		HashMap<Character, Boolean> hMap = new HashMap<Character, Boolean>();
		boolean judgeLower = false;
		boolean judgeUpper = false;
		for(char c : ca) {
			if(hMap.containsKey(c)) {
				System.out.println("No");
				return;
			}
			if(Character.isLowerCase(c)) judgeLower = true;
			if(Character.isUpperCase(c)) judgeUpper = true;
			hMap.put(c, true);
//			System.out.println(hMap);
		}
		if (judgeLower && judgeUpper) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
