package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC224_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sa = str.split("");
		if(sa[sa.length-1].equals("r")) {
			System.out.println("er");
		} else {
			System.out.println("ist");
		}
	}

}
