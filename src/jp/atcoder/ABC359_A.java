package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC359_A {

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
		aCountTakahashi(sl);
	}
	private static void aCountTakahashi(ArrayList<String> sl) {
		int ans = 0;
		for(String s:sl) {
			if(s.equals("Takahashi")) ans++;
		}
		System.out.println(ans);
	}
}
