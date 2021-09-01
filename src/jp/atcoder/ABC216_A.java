package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC216_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sa = str.split("\\.");
//		System.out.println(Arrays.toString(sa));
		int[] il = new int[sa.length];
		for(int i=0;i<sa.length;i++) { il[i] = Integer.parseInt(sa[i]); }
		String ans;
		if(il[1] >= 7) {
			ans = "+";
		}else if(il[1] >= 3) {
			ans = "";
		}else{
			ans = "-";
		}
		System.out.println(il[0] + ans);
	}

}
