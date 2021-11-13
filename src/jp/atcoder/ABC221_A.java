package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC221_A {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sa = str.split(" ");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(int i=0;i<sa.length;i++) { il.add(Integer.parseInt(sa[i])); }
		int a = il.get(0);
		int b = il.get(1);
		int ans = 1;
		for(int i=0; i<a-b; i++) {
			ans *= 32;
		}
		System.out.println(ans);
	}
}
