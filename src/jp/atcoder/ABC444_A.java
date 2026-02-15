package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC444_A {

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
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		aRepdigit(sl);
	}
	private static void aRepdigit(ArrayList<String> sl) {
		String first = sl.get(0);
		for(int i=0;i<sl.size();i++) {
			if(!(first.equals(sl.get(i)))) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
