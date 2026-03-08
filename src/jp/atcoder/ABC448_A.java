package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC448_A {

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
		ArrayList<Integer> sl1 = new ArrayList<Integer>();
		for(String s:sa2) {
			sl1.add(Integer.parseInt(s));
		}
		aChmin(il1, sl1);
	}
	private static void  aChmin(ArrayList<Integer> il1, ArrayList<Integer> il2) {
		int n = il1.get(0);
		int x = il1.get(1);

		String ans = "";
		for(int i=0;i < n;i++) {
			if(x > il2.get(i)) {
				ans += 1 + "\n";
				x = il2.get(i);
			} else {
				ans += 0 + "\n";
			}
		}
		System.out.println(ans);
	}
}