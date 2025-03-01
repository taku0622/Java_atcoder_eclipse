package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC391_A {

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
		aLuckyDirection(sl);
	}
	private static void aLuckyDirection(ArrayList<String> sl) {
		String ans = "";
		switch(sl.get(0)){
		  case "N":
		    ans = "S";
		    break;
		  case "E":
			ans = "W";
		    break;
		  case "W":
			ans = "E";
			break;
		  case "S":
			ans = "N";
			break;
		  case "NE":
		    ans = "SW";
			break;
		  case "NW":
			ans = "SE";
			break;
		  case "SE":
			ans = "NW";
			break;
		  case "SW":
			ans = "NE";
			break;
		}
		System.out.println(ans);
	}
}
