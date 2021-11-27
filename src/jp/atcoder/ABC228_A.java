package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC228_A {

	public static void main(String[] args) {
		String str;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str.split(" ");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(int i=0;i<sa.length;i++) { il.add(Integer.parseInt(sa[i])); }
		int a = il.get(0);
		int b = il.get(1);
		int c = il.get(2);
		onAndOff(a,b,c);
	}
	private static void onAndOff(int a,int b,int c) {
		String ans;
		if(a < b) {
			ans = ((a<=c && c<b)) ? "Yes" : "No";
		}else if(a<=c || c<b){
			ans = "Yes";
		}else {
			ans ="No";
		}
		System.out.println(ans);
	}

}
