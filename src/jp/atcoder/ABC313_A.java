package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC313_A {

	public static void main(String[] args) {
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
		String[] sa2 = str2.split("");
		ArrayList<Integer> il2 = new ArrayList<Integer>();
		for(String s:sa2) {
			il2.add(Integer.parseInt(s));
		}
		aFirstABC(il1, il2);
	}
	private static void aFirstABC(ArrayList<Integer> il1, ArrayList<Integer> il2) {
		int count = il1.get(0);
		ArrayList<String> abc = new ArrayList<String>();
		abc.add("A");
		abc.add("B");
		abc.add("C");
//		System.out.println(abc);
		for(int i=0;i<count;i++) {
			abc.remove(il2.get(i));
			if(abc.size() == 0) {
				System.out.println(i+1);
				return;
			}
		}
	}
}