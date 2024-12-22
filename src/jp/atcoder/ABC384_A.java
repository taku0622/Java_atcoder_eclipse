package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC384_A {

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
		ArrayList<String> sl1 = new ArrayList<String>();
		for(String s:sa) {
			sl1.add(s);
		}
		String[] sa2 = str2.split("");
		ArrayList<String> sl2 = new ArrayList<String>();
		for(String s:sa2) {
			sl2.add(s);
		}
		aAaaadaa (sl1,sl2);
	}
	private static void aAaaadaa(ArrayList<String> sl1, ArrayList<String> sl2) {
		int n = Integer.parseInt(sl1.get(0));
		String target = sl1.get(1);
		String replace = sl1.get(2);
		String ans = "";
		for(int i=0;i<n;i++) {
			if(sl2.get(i).equals(target)){
				ans += sl2.get(i);
			}else {
				ans += replace;
			}
		}
		System.out.println(ans);
	}
}