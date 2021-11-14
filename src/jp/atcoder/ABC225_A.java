package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class ABC225_A {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sa = str.split("");
		HashSet<String> ss = new HashSet<String>();
		for(int i=0;i<sa.length;i++) { ss.add(sa[i]); }
//		System.out.println(ss.size());
		switch(ss.size()) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(3);
			break;
		case 3:
			System.out.println(6);
			break;
		}
	}
}
