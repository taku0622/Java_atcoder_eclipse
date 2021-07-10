package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC126_B {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int i1 = Integer.parseInt(str.substring(0, 2));
		int i2 = Integer.parseInt(str.substring(2, 4));
		String ans = "NA\r\n";
		if((i1 > 0 && i1 < 13) && (i2 > 0 && i2 < 13)) {
			ans = "AMBIGUOUS\r\n";
		} else if (i1 > 0 && i1 < 13) {
			ans = "MMYY\r\n";
		} else if (i2 > 0 && i2 < 13) {
			ans = "YYMM\r\n";
		}
		System.out.println(ans);
	}
}
