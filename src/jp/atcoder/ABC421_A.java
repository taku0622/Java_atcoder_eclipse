package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC421_A {

	public static void main(String[] args) {
		String str1;
		ArrayList<String> sl = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			String[] sa = str1.split(" ");
			for(int i=0;i<=Integer.parseInt(sa[0]);i++) {
				String str = br.readLine();
				sl.add(str);
			}
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		aMisdelivery(sl, Integer.parseInt(str1));
	}
	private static void aMisdelivery(ArrayList<String> sl, Integer i) {
		String[] arr = sl.get(i).split(" ");
		int t = Integer.parseInt(arr[0]);
		String s = arr[1];
		if(sl.get(t-1).equals(s)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
