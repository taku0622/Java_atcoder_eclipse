package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC200_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int i1;
		int i2;
		if(str.length() < 3) {
			System.out.println(1);
			System.exit(0);
		}
		if(str.length() == 3) {
			i1 = Integer.parseInt(str.substring(0, 1));
			i2 = Integer.parseInt(str.substring(1, 3));
		} else {
			i1 = Integer.parseInt(str.substring(0, 2));
			i2 = Integer.parseInt(str.substring(2, 4));
		}
		int ans = i2 > 0 ? i1 + 1 : i1;
		System.out.println(ans);
	}

}
