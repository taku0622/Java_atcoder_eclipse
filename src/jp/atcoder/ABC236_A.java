package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC236_A {

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
		String[] arr = str2.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		chukodai(str1,a,b);
	}
	private static void chukodai(String abc, int a, int b) {
		String[] arr = abc.split("");
		String ans = "";
		for(int i=0;i<arr.length;i++) {
			if(i+1 == a) {
				ans += arr[b-1];
			}else if (i+1 == b) {
				ans += arr[a-1];
			}else {
				ans += arr[i];
			}
		}
		System.out.println(ans);
	}
}
