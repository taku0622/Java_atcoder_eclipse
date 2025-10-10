package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC426_A {

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
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		aOSVersions(sl);
	}
	private static void aOSVersions(ArrayList<String> sl) {
		// O:O
		// S:O,S
		// L:O,S,L
		String ans = "No";
		String x = sl.get(0);
		String y = sl.get(1);
		if(x.equals("Ocelot")) {
			if(y.equals("Ocelot")) {
				ans = "Yes";
			}
		}
		if(x.equals("Serval")) {
			if(y.equals("Ocelot") || y.equals("Serval")) {
				ans = "Yes";
			}
		}
		if(x.equals("Lynx")) {
			if(y.equals("Ocelot") || y.equals("Serval") || y.equals("Lynx")) {
				ans = "Yes";
			}
		}
		System.out.println(ans);
	}
}
