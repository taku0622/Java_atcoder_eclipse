package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC200_B {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sa = str.split(" ");
		int[] il = new int[sa.length];
		for(int i=0;i<sa.length;i++) { il[i] = Integer.parseInt(sa[i]); }
		long ans=il[0];
		int f = il[1];
		for(int i=0; i<f; i++) {
			if(ans%200!=0) {

				ans = Long.parseLong(String.valueOf(ans) + "200");
			}else {
				ans /= 200;
			}
		}
		System.out.println(ans);
	}

}
