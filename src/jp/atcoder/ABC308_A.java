package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC308_A {

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
		aNewScheme(il);
	}
	private static void  aNewScheme(ArrayList<Integer> il) {
		il.add(700);
		boolean flag = true;
		for(int i=0;i<7;i++) {
//			System.out.println(il.get(i));
			if(il.get(i)>il.get(i+1)) flag = false;
			if(il.get(i)<100 || il.get(i) > 675) flag = false;
			if(il.get(i)%25 != 0) flag = false;
			if(!flag) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}



}