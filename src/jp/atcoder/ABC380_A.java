package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC380_A {

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
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		a123233(il);
	}
	private static void a123233(ArrayList<Integer> il) {
		String ans = "No";
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for(int i : il) {
			switch(i){
				case 1:
					c1++;
					break;
				case 2:
					c2++;
					break;
				case 3:
					c3++;
					break;
			}
		}
		if(c1 == 1 && c2 == 2 && c3 == 3) {
			ans = "Yes";
		}
		System.out.println(ans);
	}
}
