package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC393_A {

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
		aPoisonousOyster(sl);
	}
	private static void aPoisonousOyster(ArrayList<String> sl) {
		int ans = 4;
		String a = sl.get(0);
		String b = sl.get(1);

		// 1
		if(a.equals("sick") && b.equals("sick")) ans = 1;
		// 2
		if(a.equals("sick") && b.equals("fine")) ans = 2;
		// 3
		if(a.equals("fine") && b.equals("sick")) ans = 3;
		System.out.println(ans);
	}
}
