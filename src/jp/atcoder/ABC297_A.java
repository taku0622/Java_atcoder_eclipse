package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC297_A {

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
		String[] sa2 = str2.split(" ");
		ArrayList<Integer> il2 = new ArrayList<Integer>();
		for(String s:sa2) {
			il2.add(Integer.parseInt(s));
		}
		aDoubleClick(il, il2);
	}
	private static void  aDoubleClick(ArrayList<Integer> il,ArrayList<Integer> il2) {
		int size = il.get(0);
		int span = il.get(1);
		for(int i=0;i<size-1;i++) {
//			System.out.println(i);
//			System.out.println(il2.get(i+1) + " - " + il2.get(i));
			if(il2.get(i+1) - il2.get(i) <= span) {
				System.out.println(il2.get(i+1));
				return;
			}
		}
		System.out.println(-1);
	}
}