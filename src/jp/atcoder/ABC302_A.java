package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class ABC302_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split(" ");
		ArrayList<String> il = new ArrayList<String>();
		for(String s:sa) {
			il.add(s);
		}
		aAttack(il);
	}
	private static void aAttack(ArrayList<String> sl) {
		BigDecimal i1 = new BigDecimal(sl.get(0));
		BigDecimal i2 = new BigDecimal(sl.get(1));
		BigDecimal ans = i1.divide(i2, 0, RoundingMode.CEILING);
		System.out.println(ans);
	}
}
