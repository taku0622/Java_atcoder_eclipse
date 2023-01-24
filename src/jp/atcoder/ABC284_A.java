package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC284_A {

	public static void main(String[] args) {
		String str1;
		ArrayList<String> sl = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			String[] sa = str1.split(" ");
			for(int i=0;i<Integer.parseInt(sa[0]);i++) {
				String str = br.readLine();
				sl.add(str);
			}
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		aSequenceofStrings(sl);
	}
	private static void aSequenceofStrings(ArrayList<String> sl) {
		for(int i=sl.size()-1;i>-1;i--) {
			System.out.println(sl.get(i));
		}
	}
}
