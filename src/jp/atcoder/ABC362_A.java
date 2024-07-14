package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC362_A {

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
			int n = 0;
			switch(s) {
			case "Red":
				n = 0;
				break;
			case "Green":
				n = 1;
				break;
			case "Blue":
				n = 2;
			}
			il2.add(n);
		}
		aBuyaPen(il1,il2);
	}
	private static void aBuyaPen(ArrayList<Integer> il1, ArrayList<Integer> il2) {
		int r = il2.get(0);
		il1.remove(r);
//		System.out.println(il2);
//		System.out.println(il1);
		int a = il1.get(0);
		int b = il1.get(1);
		int ans = a < b ? a:b;
		System.out.println(ans);
	}
}