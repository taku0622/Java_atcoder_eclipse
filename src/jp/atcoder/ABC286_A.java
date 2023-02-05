package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ABC286_A {

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
		aRangeSwap(il, il2);
	}
	private static void aRangeSwap(ArrayList<Integer> il,ArrayList<Integer> il2) {
		List subList1 = il2.subList(il.get(1)-1, il.get(2));
		List subList2 = il2.subList(il.get(3)-1, il.get(4));
		ArrayList<Integer> pubSubList1 = new ArrayList<Integer>();
		for(int i=0;i<subList1.size();i++) {
			pubSubList1.add(Integer.parseInt(subList1.get(i).toString()));
			subList1.set(i, subList2.get(i));
			subList2.set(i, pubSubList1.get(i));
		}
		String ans = "";
		for(int i:il2) {
			ans += i + " ";
		}
		System.out.println(ans);
	}
}
