package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC312_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split(" ");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		aNine(il);
	}
	private static void  aNine(ArrayList<Integer> il) {
		int a = il.get(0);
		int b = il.get(1);
		String ans = "";
		if(a==1 && b==2) {
			ans = "Yes";
		}else if(a==2 && b==3) {
			ans = "Yes";
		}else if(a==4 && b==5) {
			ans = "Yes";
		}else if(a==5 && b==6) {
			ans = "Yes";
		}else if(a==7 && b==8) {
			ans = "Yes";
		}else if(a==8 && b==9) {
			ans = "Yes";
		}else {
			ans = "No";
		}
		System.out.println(ans);
	}



}