package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC262_A {

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
		worldCup(il);
	}
	private static void worldCup(ArrayList<Integer> il) {
		int y = il.get(0);
		for(;;) {
			if(y % 4 == 2) {
				break;
			}else {
				y++;
			}
		}
		System.out.println(y);
	}
}
