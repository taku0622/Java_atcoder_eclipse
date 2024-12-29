package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC386_A {

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
		aFullHouse2(il);
	}
	private static void aFullHouse2(ArrayList<Integer> il) {
		int a = il.get(0);
		int countOne = 0;
		int countTwo = 0;
		int index = 0;
		for(int i=0;i<4;i++) {
			if(a == il.get(i)) {
				countOne++;
			}else {
				index = i;
			}
		}
		int b = il.get(index);
		for(int j=0;j<4;j++) {
			if(b == il.get(j)) {
				countTwo++;
			}
		}
//		System.out.println(countOne);
//		System.out.println(countTwo);
		// countOne = 1 かつ　countTwo = 3
		// countOne = 2 かつ　countTwo = 2
		// countOne = 3 かつ　countTwo = 1
		if(countOne == 1 && countTwo == 3 || countOne == 2 && countTwo == 2 || countOne == 3 && countTwo == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
