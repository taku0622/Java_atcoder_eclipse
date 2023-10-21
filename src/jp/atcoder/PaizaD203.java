package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PaizaD203 {
	public static void main(String[] args) {
		String str1;
		String str2;
		String str3;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			str2 = br.readLine();
			str3 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split("");
		ArrayList<String> sl1 = new ArrayList<String>();
		for(String s:sa) {
			sl1.add(s);
		}
		String[] sa2 = str2.split(" ");
		ArrayList<String> sl2 = new ArrayList<String>();
		for(String s:sa2) {
			sl2.add(s);
		}
		String[] sa3 = str3.split(" ");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa3) {
			il.add(Integer.parseInt(s));
		}
		d203(sl1,sl2,il);
	}
	private static void d203(ArrayList<String> sl1, ArrayList<String> sl2, ArrayList<Integer> il) {
		// if文
		String ans = "";
		if(sl1.get(il.get(0)-1).equals(sl2.get(0))) {
			ans = "Yes";
		}else{
			ans = "No";
		}
		System.out.println(ans);
	}
}