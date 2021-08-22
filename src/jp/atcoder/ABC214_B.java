package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC214_B {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sa = str.split(" ");
		int[] il = new int[sa.length];
		for(int i=0;i<sa.length;i++) { il[i] = Integer.parseInt(sa[i]); }
		int ans = 0;
		for(int i=0;i<=il[0];i++) {
			for(int j=0;i+j<=il[0];j++) {
				for(int k=0;i+j+k<=il[0];k++) {
					if(i*j*k<=il[1]) { ans++; }
				}
			}
		}
		System.out.println(ans);
	}

}
