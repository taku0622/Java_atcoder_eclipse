package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC202_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		int sum = 0;
		for(String s:arr) {
			sum += 7 - Integer.parseInt(s);
		}
		System.out.println(sum);
	}

}
