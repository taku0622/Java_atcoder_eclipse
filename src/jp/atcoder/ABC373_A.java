package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC373_A {

	public static void main(String[] args) {
		ArrayList<String> sl = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for(int i=0;i<12;i++) {
				String str = br.readLine();
				sl.add(str);
			}
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		aSeptember(sl);
	}
	private static void aSeptember(ArrayList<String> sl) {
		int count = 0;
		for(int i=0;i<sl.size();i++) {
			if(sl.get(i).length() == i+1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
