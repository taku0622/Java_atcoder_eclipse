package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC433_A {

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
		aHappyBirthday(il);
	}
	private static void aHappyBirthday(ArrayList<Integer> il) {
		int x = il.get(0);
		int y = il.get(1);
		int z = il.get(2);
		for(;y * z <= x;){
			if(y * z == x) {
				System.out.println("Yes");
				return;
			}
			x++;
			y++;
		}
		System.out.println("No");
	}
}
