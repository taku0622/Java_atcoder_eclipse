package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC215_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
//		String[] sa = str.split(" ");
//		int[] il = new int[sa.length];
//		for(int i=0;i<sa.length;i++) { il[i] = Integer.parseInt(sa[i]); }
		String ans = str.equals("Hello,World!") ? "AC" : "WA";
		System.out.println(ans);
	}


}
