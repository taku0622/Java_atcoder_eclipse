package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC205_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sl = str.split(" ");
		int[] il = new int[2];
		il[0] = Integer.parseInt(sl[0]);
		il[1] = Integer.parseInt(sl[1]);
		double ans = il[0] * il[1] / 100.0;	// 100 : a = b : ans → ab/100 = ans
		System.out.println(ans);
	}

}
