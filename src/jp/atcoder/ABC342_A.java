package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC342_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split("");
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		aYay(sl);
	}
	private static void  aYay(ArrayList<String> sl) {
		int ans = 0;
		// abaaaaaa, baaaaaaa, aaaaab
		for(int i=1;i<sl.size()-1;i++) {
			String s1 = sl.get(i-1);
			String s2 = sl.get(i);
			String s3 = sl.get(i+1);
//			System.out.println(s1 + " " + s2 + " " + s3);
			// aab aba baa
			if(s1.equals(s2) && !s2.equals(s3)) {
				ans = i + 2;
				break;
			}else if(!s1.equals(s2) && !s2.equals(s3)) {
				ans = i + 1;
				break;
			}else if(!s1.equals(s2) && !s1.equals(s3)) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}