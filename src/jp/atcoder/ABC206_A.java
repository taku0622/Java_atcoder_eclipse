package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC206_A {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		double m = n * 1.08;
		String ans;
		if (m < 206) {
			ans = "Yay!";
		} else if((int)m == 206){
			ans = "so-so";
		} else {
			ans = ":(";
		}
		System.out.println(ans);
	}

}
