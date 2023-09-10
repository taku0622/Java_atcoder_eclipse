package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class ABC319_A {

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
		aLegendaryPlayers(sl);
	}
	private static void  aLegendaryPlayers(ArrayList<String> sl) {
		HashMap<String, Integer> hm = new java.util.HashMap<String, Integer>();
		hm.put("tourist",3858);
		hm.put("ksun48",3679);
		hm.put("Benq",3658);
		hm.put("Um_nik",3648);
		hm.put("apiad",3638);
		hm.put("Stonefeang",3630);
		hm.put("ecnerwala",3613);
		hm.put("mnbvmar",3555);
		hm.put("newbiedmy",3516);
		hm.put("semiexp",3481);
//		System.out.println(sl.get(0));
		System.out.println(hm.get(sl.get(0)));
	}
}