package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC422_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split("-");
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		aStageClear(sl);
	}
	private static void aStageClear(ArrayList<String> sl) {
//		System.out.println(sl);
		int a = Integer.parseInt(sl.get(0));
		int b = Integer.parseInt(sl.get(1));
		if(b == 8){
			a+=1;
			b=1;
		} else {
			b+=1;
		}
		System.out.println(a + "-" + b);
	}
}
