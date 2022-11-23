package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC277_A {

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
		str2 += " " + str1;
		String[] sa = str2.split(" ");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		abc277(il);
	}
	private static void abc277(ArrayList<Integer> il) {
		int target = il.get(il.size() -1);
		int count = 0;
		for(int i=0;i<il.size()-2;i++) {
			if(il.get(i) == target) {
				count = i + 1;
				break;
			}
		}
		System.out.println(count);
	}
}
