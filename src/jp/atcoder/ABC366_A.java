package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC366_A {

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
		aElection2(il);
	}
	private static void aElection2(ArrayList<Integer> il) {
		int n = il.get(0);
		int t = il.get(1);
		int a = il.get(2);
		int rest = n - (t + a);
		int sub = Math.abs(t-a);
		if(rest < sub) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
