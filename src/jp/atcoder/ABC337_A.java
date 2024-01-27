package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC337_A {

	public static void main(String[] args) {
		String str1;
		int taka = 0;
		int ao = 0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			String[] sa = str1.split(" ");
			for(int i=0;i<Integer.parseInt(sa[0]);i++) {
				String str = br.readLine();
				String[] a = str.split(" ");
				taka += Integer.parseInt(a[0]);
				ao += Integer.parseInt(a[1]);
			}
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		aScoreboard(taka, ao);
	}
	private static void aScoreboard(int taka, int ao) {
		if (taka > ao) {
			System.out.println("Takahashi");
		} else if (taka == ao) {
			System.out.println("Draw");
		} else {
			System.out.println("Aoki");
		}
	}
}
