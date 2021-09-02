package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class ABC216_B {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sa = str.split(" ");
		int[] il = new int[sa.length];
		for(int i=0;i<sa.length;i++) { il[i] = Integer.parseInt(sa[i]); }
		ArrayList<String> sl = new ArrayList<String>();
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<il[0];i++) {
			String st = br.readLine();
			sl.add(st);
			hs.add(st);
		}
		String ans = sl.size() == hs.size() ? "No" : "Yes";
		System.out.println(ans);
	}

}
