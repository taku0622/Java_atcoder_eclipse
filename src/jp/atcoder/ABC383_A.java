package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC383_A {

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
		aHumidifier1(sl);
	}
	private static void aHumidifier1(ArrayList<String> sl) {
		int[] ans = {0, 0};
		for(int i=0; i < sl.size(); i++) {
			String[] sa = sl.get(i).split(" ");
			int t = Integer.parseInt(sa[0]); // 2
			int v = Integer.parseInt(sa[1]); // 4
			ans[1] = ans[1] - (t - ans[0]);
			ans[1] = ans[1] < 0 ? 0 : ans[1];
			ans[0] = t;
			ans[1] += v;
//			System.out.println(ans[0]);
//			System.out.println(ans[1]);
		}
		System.out.println(ans[1]);
	}
}
