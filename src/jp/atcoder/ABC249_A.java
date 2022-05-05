package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC249_A {

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
		jogging(il);
	}
	private static void jogging (ArrayList<Integer> il) {
		// a:0 b:1 c:2 d:3 e:4 f:5 g:6
		// takahashi
		int a = (il.get(6) / (il.get(0)+il.get(2))*il.get(0))*il.get(1);
		int b = il.get(6)%(il.get(0)+il.get(2)) > il.get(0) ?
				 il.get(0) * il.get(1) : il.get(6)%(il.get(0)+il.get(2))*il.get(1);
//		System.out.println("a="+a+" b="+b);
		// aoki
		int c = (il.get(6) / (il.get(3)+il.get(5))*il.get(3))*il.get(4);
		int d = il.get(6)%(il.get(3)+il.get(5)) > il.get(3) ?
				 il.get(3) * il.get(4) : il.get(6)%(il.get(3)+il.get(5))*il.get(4);
//		System.out.println("c="+c+" d="+d);
		if(a+b == c+d) {
			System.out.println("Draw");
		}else if (a+b > c+d) {
			System.out.println("Takahashi");
		}else {
			System.out.println("Aoki");
		}

	}
}
