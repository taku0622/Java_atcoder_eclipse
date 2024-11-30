package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC381_A {

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
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		String[] sa2 = str2.split("");
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa2) {
			sl.add(s);
		}
		a1122String(il,sl);
	}
	private static void a1122String(ArrayList<Integer> il, ArrayList<String> sl) {
		String ans = "No";
		if(il.get(0)%2 == 1) {
			int half = (il.get(0)+1) / 2;
			if(sl.get(half-1).equals("/")) {
				boolean flag1 = true;
				boolean flag2 = true;
				for(int i=0;i<half-1;i++) {
//					System.out.println("1: " + sl.get(i));
					if(!(sl.get(i).equals("1"))) flag1 = false;
				}
				for(int j=half;j<il.get(0);j++) {
//					System.out.println("2: " + sl.get(j));
					if(!(sl.get(j).equals("2"))) flag2 = false;
				}
				if(flag1 && flag2) ans = "Yes";
			}
		}
		System.out.println(ans);
	}
}