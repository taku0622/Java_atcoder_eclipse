package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC431_A {

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
		aRobotBalance(il);
	}
	private static void aRobotBalance(ArrayList<Integer> il) {
		int h = il.get(0);
		int b = il.get(1);
		if(h - b >= 0) {
			System.out.println(h - b);
		}else {
			System.out.println(0);
		}
	}
}
