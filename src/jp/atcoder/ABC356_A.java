package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC356_A {

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
		aSubsegmentReverse(il);
	}
	private static void  aSubsegmentReverse(ArrayList<Integer> il) {
		int n = il.get(0);
		int first = il.get(1);
		int end = il.get(2);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> cut = new ArrayList<Integer>();
		for(int i=1; i < n+1; i++) {
			if(i>=first && i<=end) {
				cut.add(i);
			}else {
				list.add(i);
			}
		}
		ArrayList<Integer> reverse = new ArrayList<Integer>();
		for(int i=end; i > first-1; i--) {
			reverse.add(i);
		}
		for(int i=0;i<cut.size();i++) {
			list.add(cut.get(i)-1, reverse.get(i));
		}
		String ans = "";
		for(int i:list) {
			ans += i + " ";
		}
		System.out.println(ans);
	}
}