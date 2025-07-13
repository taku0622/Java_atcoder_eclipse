package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC412_A {

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
		aTaskFailedSuccessfully(sl);
	}
	private static void aTaskFailedSuccessfully(ArrayList<String> sl) {
		int ans = 0;
		for(int i=0;i<sl.size();i++) {
			String v = sl.get(i);
			String[] sa = v.split(" ");
			int v1 = Integer.parseInt(sa[0]);
			int v2 = Integer.parseInt(sa[1]);
			if(v1 < v2) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
