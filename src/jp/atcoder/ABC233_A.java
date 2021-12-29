package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC233_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] arr = str1.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		tenYenStamp(a,b);
	}
	private static void tenYenStamp(int a, int b) {
		int ans = 0;
		for(;;) {
			if(a >= b) { break; }
			a += 10;
			ans += 1;
		}
		System.out.println(ans);
	}
}
