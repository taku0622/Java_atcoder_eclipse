package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC298_A {

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
		aJobInterview(il, sl);
	}
	private static void  aJobInterview(ArrayList<Integer> il,ArrayList<String> sl) {
		boolean flag1 = false; // include o
		boolean flag2 = false; // include x
		for(int i = 0; i<il.get(0); i++) {
			if(sl.get(i).equals("o")) {
				flag1 = true;
			}
			if(sl.get(i).equals("x")) {
				flag2 = true;
			}
		}
		if(flag1 && !flag2) {
			System.out.println("Yes");
		}else {

			System.out.println("No");
		}
	}
}