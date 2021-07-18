package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ABC204_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sl = str.split(" ");
		Arrays.sort(sl);
		int[] il = new int[2];
		il[0] = Integer.parseInt(sl[0]);
		il[1] = Integer.parseInt(sl[1]);
		int ans = il[0] == il[1] ? il[0] : 3 - (il[0]+il[1]);
		System.out.println(ans);
	}
}
