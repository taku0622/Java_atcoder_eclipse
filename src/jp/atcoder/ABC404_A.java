package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC404_A {

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
		aNotFound(sl);
	}
	private static void aNotFound(ArrayList<String> sl) {
		String ans = "";
		ArrayList<String> alphabetList = new ArrayList<String>();
		alphabetList.add("a");
		alphabetList.add("b");
		alphabetList.add("c");
		alphabetList.add("d");
		alphabetList.add("e");
		alphabetList.add("f");
		alphabetList.add("g");
		alphabetList.add("h");
		alphabetList.add("i");
		alphabetList.add("j");
		alphabetList.add("k");
		alphabetList.add("l");
		alphabetList.add("m");
		alphabetList.add("n");
		alphabetList.add("o");
		alphabetList.add("p");
		alphabetList.add("q");
		alphabetList.add("r");
		alphabetList.add("s");
		alphabetList.add("t");
		alphabetList.add("u");
		alphabetList.add("v");
		alphabetList.add("w");
		alphabetList.add("x");
		alphabetList.add("y");
		alphabetList.add("z");
		for(int i = 0; i < alphabetList.size(); i++) {
			if(!sl.contains(alphabetList.get(i))) {
				ans = alphabetList.get(i);
				break;
			}
		}
		System.out.println(ans);
	}
}
