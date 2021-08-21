package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC213_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sa = str.split(" ");
		int[] il = new int[sa.length];
		for(int i=0;i<sa.length;i++) { il[i] = Integer.parseInt(sa[i]); }
		String bin1,bin2;
		if(il[0] >= il[1]) {
			bin1 = Integer.toBinaryString(il[0]);
			bin2 = Integer.toBinaryString(il[1]);
		}else {
			bin1 = Integer.toBinaryString(il[1]);
			bin2 = Integer.toBinaryString(il[0]);
		}
		while(bin1.length() > bin2.length()) {
			bin2 = "0" + bin2;
		}
//		System.out.println(bin1);System.out.println(bin2);
		String[] bin1Arr = bin1.split("");
		String[] bin2Arr = bin2.split("");
		String[] ansArr = new String[bin1.length()];
		for(int i=0;i < bin1.length();i++) {
			if(bin1Arr[i].equals(bin2Arr[i])){
				ansArr[i] = "0";
			}else {
				ansArr[i] = "1";
			}
		}
		int ans = Integer.parseInt(String.join("", ansArr), 2);
		System.out.println(ans);
	}

}
