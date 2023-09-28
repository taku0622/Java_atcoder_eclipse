package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC321_A {

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
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		a321LikeChecker(il);
	}
	private static void  a321LikeChecker(ArrayList<Integer> il) {
		String ans = "No";
		if(il.size() == 1) {
			ans = "Yes";
		} else {
			for(int i=0;i<il.size()-1;i++) {
				if(il.get(i) > il.get(i+1)) {
					ans = "Yes";
				} else {
					ans = "No";
					break;
				}
			}
		}
		System.out.println(ans);
	}
}