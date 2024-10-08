package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC371_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split(" ");
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		aJiro(sl);
	}
	private static void aJiro(ArrayList<String> sl) {
//		System.out.println(sl);
		String S_AB = sl.get(0);
		String S_AC = sl.get(1);
		String S_BC = sl.get(2);
		// 比較関係に基づいて年齢順を決定
		if (S_AB.equals(">") && S_AC.equals(">")) {
			// Aが最年長
			if (S_BC.equals(">")) {
				System.out.println("B"); // C < B < A
			} else {
				System.out.println("C"); // B < C < A
			}
		} else if (S_AB.equals("<") && S_AC.equals("<")) {
			// Aが最年少
			if (S_BC.equals(">")) {
				System.out.println("C"); // A < C < B
			} else {
				System.out.println("B"); // A < B < C
			}
		} else if (S_AB.equals(">") && S_AC.equals("<")) {
			// Bが最年少
			System.out.println("A"); // B < A < C
		} else if (S_AB.equals("<") && S_AC.equals(">")) {
			// Cが最年少
			System.out.println("A"); // C < A < B
		}
	}
}
