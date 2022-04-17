package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC248_A {

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
		lackedNumber(il);
	}
	private static void lackedNumber(ArrayList<Integer> il) {
		ArrayList<Integer> zeroToTenArray = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			zeroToTenArray.add(i);
		}
		zeroToTenArray.removeAll(il);
		System.out.println(zeroToTenArray.toString().replace("[", "").replace("]", ""));
	}
}
