package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC441_A {

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
		aBlackSquare(il1, sl1);
	}
	private static void  aBlackSquare(ArrayList<Integer> il1, ArrayList<Integer> il2) {
		long p = il1.get(0);
		long q = il1.get(1);

		long x = il2.get(0);
		long y = il2.get(1);

//		System.out.println("p : q =" + p + " : " + q);
//		System.out.println("x : y =" + x + " : " + y);

		String ans = "No";

		long p100 = p + 100;
		long q100 = q + 100;

		if((p <= x && x < p100) && (q <= y && y < q100)) {
			ans = "Yes";
		}

		System.out.println(ans);
	}
}