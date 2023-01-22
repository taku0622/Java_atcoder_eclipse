package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC280_A {

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
		aPawnOnaGrid(sl);
	}
	private static void aPawnOnaGrid(ArrayList<String> sl) {
		int sum = 0;
		for(int i=0;i<sl.size();i++) {
			for(int j=0;j<sl.get(i).length();j++) {
				sum += sl.get(i).charAt(j) == '#' ? 1 : 0;
			}
		}
		System.out.println(sum);
	}
}
