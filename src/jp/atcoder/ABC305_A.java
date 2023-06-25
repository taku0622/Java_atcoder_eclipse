package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC305_A {

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
		aWaterStation(il);
	}
	private static void  aWaterStation(ArrayList<Integer> il) {
		String[] a = String.valueOf(il.get(0)).split("");
		if (il.get(0)>=98) { // 98以上
			System.out.println(100);
		} else if(il.get(0)<=2) { // 2以下
			System.out.println(0);
		} else if(il.get(0)<=7) { // 7以下
			System.out.println(5);
		} else if(il.get(0)<=10) { // 10以下
			System.out.println(10);
		} else {
			if (a[1].equals("3")||a[1].equals("4")||a[1].equals("5")||a[1].equals("6")||a[1].equals("6")) {
				System.out.println(a[0]+5);
			}else {
				if (a[1].equals("0")||a[1].equals("1")||a[1].equals("2")) {
					System.out.println(a[0]+0);
				}else {
					System.out.println((Integer.parseInt(a[0]) + 1) + '0');
				}
			}
		}
	}



}