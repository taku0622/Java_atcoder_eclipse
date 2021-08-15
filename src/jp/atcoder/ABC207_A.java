package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC207_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sa = str.split(" ");
		int[] il = new int[2];
		il[0] = Integer.parseInt(sa[0]);
		il[1] = Integer.parseInt(sa[1]);
		if(il[0] * 6 >= il[1] && il[0] <= il[1]) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
