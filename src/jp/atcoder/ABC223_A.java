package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC223_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int x = Integer.parseInt(str);
		String ans = (x>0 && x%100==0)? "Yes" : "No";
		System.out.println(ans);
	}

}
