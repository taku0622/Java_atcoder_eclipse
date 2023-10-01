package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC322_A {

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
		ArrayList<Integer> il1 = new ArrayList<Integer>();
		for(String s:sa) {
			il1.add(Integer.parseInt(s));
		}
		String[] sa2 = str2.split("");
		aFirstABC2(il1, sa2);
	}
	private static void aFirstABC2(ArrayList<Integer> il1, String[] sa2) {
		int n = il1.get(0);
		for(int i=0;i<n-2;i++) {
			if(sa2[i].equals("A") && sa2[i+1].equals("B") && sa2[i+2].equals("C")) {
				System.out.println(i+1);
				return;
			}
		}
		System.out.println(-1);
	}
}