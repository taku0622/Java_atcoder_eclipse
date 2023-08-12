package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC313_A {

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
		String[] sa2 = str2.split("");
		ArrayList<Integer> il2 = new ArrayList<Integer>();
		for(String s:sa2) {
			il2.add(Integer.parseInt(s));
		}
		aToBeSaikyo(il1, il2);
	}
	private static void aToBeSaikyo(ArrayList<Integer> il1, ArrayList<Integer> il2) {
		int diff = 0;
		int p1 = il1.get(0);
		int vol = il1.get(0);
		for(int i=1;i<vol;i++) {
			// 差
			int d = il2.get(i) - p1;
			// 大きいかつ差が大きい
			if(p1 < il2.get(i) && d > diff) {
				diff = il2.get(i) - p1 + 1;
			}else if (diff == 0 && il2.get(i) == p1) {
				diff = 1;
			}
		}
		System.out.println(diff);
	}
}