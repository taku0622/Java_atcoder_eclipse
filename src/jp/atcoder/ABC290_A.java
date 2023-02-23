package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC290_A {

	public static void main(String[] args) {
		String str1;
		String str2;
		String str3;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			str2 = br.readLine();
			str3 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa1 = str1.split(" ");
		String[] sa2 = str2.split(" ");
		String[] sa3 = str3.split(" ");
		ArrayList<Integer> il1 = new ArrayList<Integer>();
		for(String s:sa1) {
			il1.add(Integer.parseInt(s));
		}
		ArrayList<Integer> il2 = new ArrayList<Integer>();
		for(String s:sa2) {
			il2.add(Integer.parseInt(s));
		}
		ArrayList<Integer> il3 = new ArrayList<Integer>();
		for(String s:sa3) {
			il3.add(Integer.parseInt(s));
		}
		aContestResult(il1,il2,il3);
	}
	private static void aContestResult(ArrayList<Integer> il1,ArrayList<Integer> il2,ArrayList<Integer> il3) {
		int ans = 0;
		for(int i:il3) {
			ans += il2.get(i-1);
		}
		System.out.println(ans);
	}
}
