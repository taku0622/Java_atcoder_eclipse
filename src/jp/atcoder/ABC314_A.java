package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC314_A {

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
		a3_14(il);
	}
	private static void  a3_14(ArrayList<Integer> il) {
		String pi = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
		String ans = pi.substring(0,il.get(0)+2);
		System.out.println(ans);
	}
}