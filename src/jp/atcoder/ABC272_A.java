package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC272_A {

	public static void main(String[] args) {
		String str0;
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str0 = br.readLine();
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
		aIntegerSum(il);
	}
	private static void aIntegerSum(ArrayList<Integer> il) {
//		System.out.println(il);
		int sum = 0;
		for(int i : il) {
			sum += i;
		}
		System.out.println(sum);
	}
}
