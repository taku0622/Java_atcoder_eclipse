package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC345_A {

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
		aLeftrightarrow(sl);
	}
	private static void  aLeftrightarrow(ArrayList<String> sl) {
	    for(int i=0;i<sl.size();i++) {
	    	if(i == 0) {
	    		if(!(sl.get(0).equals("<"))) {
	    			System.out.println("No");
	    			return;
	    		}
	    	} else if (i == sl.size() - 1) {
	    		if(!(sl.get(sl.size() - 1).equals(">"))) {
	    			System.out.println("No");
	    			return;
	    		}
	    	} else {
	    		if(!(sl.get(i).equals("="))) {
	    			System.out.println("No");
	    			return;
	    		}
	    	}
	    }
	    System.out.println("Yes");
	}
}