package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC323_A {

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
		aWeakBeats(il);
	}
	private static void  aWeakBeats(ArrayList<Integer> il) {
		String ans = "Yes";
		for(int i=1;i<16;i+=2) {
			if(il.get(i)!=0) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
	}
}