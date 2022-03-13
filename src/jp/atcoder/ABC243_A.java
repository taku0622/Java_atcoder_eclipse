package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC243_A {

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
		shampoo(il);

	}
	private static void shampoo(ArrayList<Integer> il) {
		int sum = 0;
		char ans;
		int[] arr = {il.get(1), il.get(2), il.get(3)};
		for(int i = 0;;i++) {
			if(i == 3) i = 0;
			sum += arr[i];
			if(sum > il.get(0)) {
				switch(i) {
				case 0:
					ans = 'F';
					break;
				case 1:
					ans = 'M';
					break;
				default:
					ans = 'T';
					break;
				}
				break;
			}
		}
	System.out.println(ans);
	}
}
