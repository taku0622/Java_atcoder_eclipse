package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC403_A {

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
		aOddPositionSum(il1, il2);
	}
	private static void  aOddPositionSum(ArrayList<Integer> il1, ArrayList<Integer> il2) {
		int ans = 0;
		for(int i = 0; i < il1.get(0); i+=2) {
			ans += il2.get(i);
		}
		System.out.println(ans);
	}
}