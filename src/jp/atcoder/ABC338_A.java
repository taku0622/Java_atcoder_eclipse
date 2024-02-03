package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC338_A {

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
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		aCapitalized(sl);
	}
	private static void  aCapitalized(ArrayList<String> sl) {
		String ans = "Yes";
		for(int i=0;i<sl.size();i++) {
			if(i==0) {
				if (!sl.get(i).equals(sl.get(i).toUpperCase())) {
					ans = "No";
					break;
				}
			}else {
				if (!sl.get(i).equals(sl.get(i).toLowerCase())) {
					ans = "No";
					break;
				}
			}
		}
		System.out.println(ans);
	}
}