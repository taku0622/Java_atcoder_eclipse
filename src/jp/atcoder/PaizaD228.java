package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PaizaD228 {
	public static void main(String[] args) {
		// ★int 2行
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
		ArrayList<Integer> il1 = new ArrayList<Integer>();
		for(String s:sa) {
			il1.add(Integer.parseInt(s));
		}
		String[] sa2 = str2.split(" ");
		ArrayList<Integer> il2 = new ArrayList<Integer>();
		for(String s:sa2) {
			il2.add(Integer.parseInt(s));
		}
		d228(il1,il2);
	}
	private static void d228(ArrayList<Integer> il1, ArrayList<Integer> il2) {
		int ah = il1.get(0);
		int am = il1.get(1);
		int bh = il2.get(0);
		int bm = il2.get(1);
		// if文
		String ans = "";
		if(ah>=bh) {
			ans = "Yes";
			if(ah==bh&&am<bm) {
				ans = "No";
			}
		}else{
			ans = "No";
		}
		System.out.println(ans);
	}
}