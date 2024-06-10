package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC357_A {

	public static void main(String[] args) {
		String str1;
		String str2;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			str2 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split(" ");
		ArrayList<Integer> il1 = new ArrayList<Integer>();
		for(String s:sa) {
			il1.add(Integer.parseInt(s));
		}
		String[] sa2 = str2.split(" ");
		ArrayList<Integer> il2 = new ArrayList<Integer>();
		for(String s:sa2) {
			il2.add(Integer.parseInt(s));
		}
		aSanitizeHands(il1,il2);
	}
	private static void aSanitizeHands(ArrayList<Integer> il1, ArrayList<Integer> il2) {
		int n = il1.get(0);
		int m = il1.get(1);
		int ans = 0;
		for(int i=0;i<n;i++) {
			m -= il2.get(i);
			if(m < 0) {
				ans = i;
				System.out.println(ans);
				return;
			}
		}
		ans = n;
		System.out.println(ans);
	}
}