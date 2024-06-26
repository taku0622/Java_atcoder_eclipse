package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC358_A {

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
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		aWelcometoAtCoderLand(sl);
	}
	private static void  aWelcometoAtCoderLand(ArrayList<String> sl) {
	    String s = sl.get(0);
	    String t = sl.get(1);
	    String ans = "No";
	    if(s.equals("AtCoder") && t.equals("Land")) {
	    	ans = "Yes";
	    }
	    System.out.println(ans);
	}
}