package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC344_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split("\\|");
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		aSpoiler(sl);
	}
	private static void  aSpoiler(ArrayList<String> sl) {
	    if(sl.size()== 0) {
	    	System.out.println();
	    }else if(sl.size() == 1 || sl.size() == 2) {
			System.out.println(sl.get(0));
		}else{
			System.out.println(sl.get(0) + sl.get(2));
		}
	}
}