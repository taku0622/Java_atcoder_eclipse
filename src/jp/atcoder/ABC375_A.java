package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC375_A {

	public static void main(String[] args) {
		String str1;
		String str2;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			str2 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split(" ");
		ArrayList<Integer> il1 = new ArrayList<Integer>();
		for(String s:sa) {
			il1.add(Integer.parseInt(s));
		}
		String[] sa2 = str2.split("");
		ArrayList<String> sl2 = new ArrayList<String>();
		for(String s:sa2) {
			sl2.add(s);
		}
		aSeats(il1, sl2);
	}
	private static void aSeats(ArrayList<Integer> il1, ArrayList<String> sl2) {
		int count = 0;
		for(int i=0;i<il1.get(0)-2;i++) {
			String a = sl2.get(i);
			String b = sl2.get(i+1);
			String c = sl2.get(i+2);
			if(a.equals("#")&&b.equals(".")&&c.equals("#")) {
				count++;
			}
		}
		System.out.println(count);
	}
}