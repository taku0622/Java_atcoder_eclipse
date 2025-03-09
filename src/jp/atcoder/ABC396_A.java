package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC396_A {

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
		aTripleFour(sl1,sl2);
	}
	private static void aTripleFour(ArrayList<String> sl1, ArrayList<String> sl2) {
		int n = Integer.parseInt(sl1.get(0));
		String ans = "No";
		for(int i=0;i<n-2;i++) {
			String v1 = sl2.get(i);
			String v2 = sl2.get(i+1);
			String v3 = sl2.get(i+2);
			if(v1.equals(v2) && v1.equals(v3)){
				ans = "Yes";
				break;
			}
		}
		System.out.println(ans);
	}
}