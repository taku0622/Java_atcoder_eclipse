package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC327_A {

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
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		String[] sa2 = str2.split("");
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa2) {
			sl.add(s);
		}
		aAb(il,sl);
	}
	private static void aAb(ArrayList<Integer> il, ArrayList<String> sl) {
		String ans = "No";
//		System.out.println(il.get(0));
		for(int i=0; i<il.get(0)-1; i++) {
			if(sl.get(i).equals("a") && sl.get(i+1).equals("b")) {
				ans = "Yes";
			}else if(sl.get(i).equals("b") && sl.get(i+1).equals("a")) {
				ans = "Yes";
			}
		}
		System.out.println(ans);
	}
}