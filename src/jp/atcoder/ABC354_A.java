package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC354_A {

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
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		aExponentialPlant(il);
	}
	private static void  aExponentialPlant(ArrayList<Integer> il) {
		int ans = 0;
		int heightTakahashi = il.get(0);
		for(;;) {
			double heightPlant = Math.pow(2.0, ans) - 1 ;
//			System.out.println(heightPlant);
			if(heightTakahashi < heightPlant) {
				break;
			}
			ans++;
		}
		System.out.println(ans);
	}
}