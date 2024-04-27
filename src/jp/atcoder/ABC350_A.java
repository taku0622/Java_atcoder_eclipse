package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC350_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split("");
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		aPastABCs(sl);
	}
	private static void  aPastABCs(ArrayList<String> sl) {
	    int num = Integer.parseInt(sl.get(3) + sl.get(4) + sl.get(5));
	    String ans = "undefined";
	    if(num < 350) {
	    	ans = "Yes";
	    }else{
	    	ans = "No";
	    }

	    if(num == 316 || num == 0) {
	    	ans = "No";
	    }
	    System.out.println(ans);
	}
}