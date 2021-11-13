package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC219_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		int x = Integer.parseInt(s1);
		if(x>=90) {
			System.out.println("expert");
		} else if(x>=70) {
			System.out.println(90 - x);
		} else if(x>=40) {
			System.out.println(70 - x);
		} else {
			System.out.println(40 - x);
		}

//		String str = br.readLine();
//		String[] sa = str.split("");
//		int[] il = new int[sa.length];
//		for(int i=0;i<sa.length;i++) { il[i] = Integer.parseInt(sa[i]); }
//		String ans = sa[x-1].equals("o") ? "Yes" : "No";
//		System.out.println(ans);
	}
}
