package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC436_A {

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
		String[] sa = str1.split(" ");
		ArrayList<Integer> il1 = new ArrayList<Integer>();
		for(String s:sa) {
			il1.add(Integer.parseInt(s));
		}
		String[] sa2 = str2.split("");
		ArrayList<String> sl1 = new ArrayList<String>();
		for(String s:sa2) {
			sl1.add(s);
		}
		aOpadding(il1, sl1);
	}
	private static void  aOpadding(ArrayList<Integer> il1, ArrayList<String> sl1) {
		int n = il1.get(0);
		int s = sl1.size();
		int sub = n-s;
		String ans = "";
		for(int i = 0; i < n;i++) {
			if(i < sub) {
				ans += "o";
			} else {
				ans += sl1.get(i-sub);
			}
		}
		System.out.println(ans);
	}
}