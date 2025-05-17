package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC399_A {

	public static void main(String[] args) {
		String str1;
		String str2;
		String str3;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			str2 = br.readLine();
			str3 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split(" ");
		ArrayList<String> sl1 = new ArrayList<String>();
		for(String s:sa) {
			sl1.add(s);
		}
		String[] sa2 = str2.split("");
		ArrayList<String> sl2 = new ArrayList<String>();
		for(String s:sa2) {
			sl2.add(s);
		}
		String[] sa3 = str3.split("");
		ArrayList<String> sl3 = new ArrayList<String>();
		for(String s:sa3) {
			sl3.add(s);
		}
		aHammingDistance(sl1,sl2,sl3);
	}
	private static void aHammingDistance(ArrayList<String> sl1, ArrayList<String> sl2, ArrayList<String> sl3) {
		int count = 0;
		for(int i= 0; i < Integer.parseInt(sl1.get(0)); i++) {
			if(!sl2.get(i).equals(sl3.get(i))) {
				count++;
			}
		}
		System.out.println(count);
	}
}