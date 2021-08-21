package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC214_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sa = str.split(" ");
		int[] il = new int[sa.length];
		for(int i=0;i<sa.length;i++) { il[i] = Integer.parseInt(sa[i]); }
		int ans = 0;
		if(il[0] < 126) {
			ans = 4;
		}else if (il[0] < 212) {
			ans = 6;
		}else {
			ans = 8;
		}
		System.out.println(ans);
	}

}
