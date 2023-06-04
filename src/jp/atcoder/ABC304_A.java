package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC304_A {

	public static void main(String[] args) {
		String str1;
		int min = 0;
		ArrayList<String> sl = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			long value = 1000000000;
			String[] sa = str1.split(" ");
			for(int i=0;i<Integer.parseInt(sa[0]);i++) {
				String str = br.readLine();
				String[] a = str.split(" ");
				if(value > Long.parseLong(a[1])) {
					min = i;
					value = Long.parseLong(a[1]);
				}
				sl.add(a[0]);
			}
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		aFirstPlayer(sl, min);
	}
	private static void aFirstPlayer(ArrayList<String> sl, int min) {
//		System.out.println(min);
		for(int i=0;i<min;i++) {
			String string = sl.get(0);
			sl.remove(0);
			sl.add(string);
		}
		for(String s:sl) {
			System.out.println(s);
		}
	}
}
