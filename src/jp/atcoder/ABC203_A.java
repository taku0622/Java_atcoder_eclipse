package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ABC203_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sl = str.split(" ");
		Arrays.sort(sl);
		int[] il = new int[3];
		il[0] = Integer.parseInt(sl[0]);
		il[1] = Integer.parseInt(sl[1]);
		il[2] = Integer.parseInt(sl[2]);
		if(il[0] == il[1] && il[0] == il[2]) {
			System.out.println(il[0]);
		} else if (il[0] == il[1]) {
			System.out.println(il[2]);
		} else if (il[1] == il[2]) {
			System.out.println(il[0]);
		} else {
			System.out.println(0);
		}
	}
}
