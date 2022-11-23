package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC275_A {

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
		String[] sa = str2.split(" ");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		il.add(Integer.parseInt(str1));
		aFindTakahashi(il);
	}
	private static void aFindTakahashi(ArrayList<Integer> il) {
		int num = 1;
		int size = il.size()-1;
		int heignt = il.get(0);
		for(int i=1;i < size;i++) {
//			System.out.println(il.get(i));
			if(heignt < il.get(i)){
				heignt = il.get(i);
				num = i+1;
			}
		}
		System.out.println(num);
	}
}
