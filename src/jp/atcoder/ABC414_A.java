package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC414_A {

	public static void main(String[] args) {
		String str1;
		int l;
		int r;
		ArrayList<String> sl = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			String[] sa = str1.split(" ");
			for(int i=0;i<Integer.parseInt(sa[0]);i++) {
				String str = br.readLine();
				sl.add(str);
			}
			l = Integer.parseInt(sa[1]);
			r = Integer.parseInt(sa[2]);
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		aStreamerTakahashi(sl, l, r);
	}
	private static void aStreamerTakahashi(ArrayList<String> sl, int l, int r) {
		int ans = 0;
		for(int i=0;i<sl.size();i++) {
			String v = sl.get(i);
			String[] sa = v.split(" ");
			int v1 = Integer.parseInt(sa[0]);
			int v2 = Integer.parseInt(sa[1]);
			if(v1 <= l && r <= v2) {
//				System.out.println("l: " + l);
//				System.out.println("r: " + r);
//				System.out.println("v1: " + v1);
//				System.out.println("v2: " + v2);
				ans++;
			}
		}
		System.out.println(ans);
	}
}
