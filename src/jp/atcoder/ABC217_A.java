package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC217_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sa = str.split(" ");
//		int[] il = new int[sa.length];
//		for(int i=0;i<sa.length;i++) { il[i] = Integer.parseInt(sa[i]); }
		String ans = (sa[0].compareTo(sa[1]))<0 ? "Yes" : "No";
		System.out.println(ans);
	}
}
