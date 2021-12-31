package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC212_B {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		weekPassword(str1);
	}
	private static void weekPassword(String str1) {
		String ans = "Strong";
		String pattern = "0000,1111,2222,3333,4444,5555,6666,7777,8888,9999,0123456789012345";
		if(pattern.contains(str1)) { ans = "Weak"; }
		System.out.println(ans);
	}
}
