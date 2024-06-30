package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC360_A {

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
		aHealthyBreakfast(sl);
	}
	private static void aHealthyBreakfast(ArrayList<String> sl) {
		boolean flag = false;
		for(String s : sl) {
			if(s.equals("R")) {
				flag = true;
			}
			if(s.equals("M")) {
				if(flag) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}
	}
}
