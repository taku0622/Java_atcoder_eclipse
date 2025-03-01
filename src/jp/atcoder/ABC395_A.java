package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC395_A {

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
		ArrayList<String> sl1 = new ArrayList<String>();
		for(String s:sa) {
			sl1.add(s);
		}
		String[] sa2 = str2.split(" ");
		ArrayList<String> sl2 = new ArrayList<String>();
		for(String s:sa2) {
			sl2.add(s);
		}
		aStrictlyIncreasing(sl1,sl2);
	}
	private static void aStrictlyIncreasing(ArrayList<String> sl1, ArrayList<String> sl2) {
		int n = Integer.parseInt(sl1.get(0));
		String ans = "Yes";
		for(int i=0;i<n-1;i++) {
			if(Integer.parseInt(sl2.get(i)) >= Integer.parseInt(sl2.get(i+1))){
				ans = "No";
			}
		}
		System.out.println(ans);
	}
}