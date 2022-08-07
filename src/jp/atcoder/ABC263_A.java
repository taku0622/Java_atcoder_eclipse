package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class ABC263_A {

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
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) {
			il.add(Integer.parseInt(s));
		}
		fullHouse(il);
	}
	private static void fullHouse(ArrayList<Integer> il) {
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i : il) {
			if(hmap.containsKey(i)) {
				int v = hmap.get(i) + 1;
				hmap.put(i,v);
			}else {
				hmap.put(i, 1);
				list.add(i);
			}
		}
		if(hmap.get(list.get(0)) == 2 && hmap.get(list.get(1)) == 3) {
			System.out.println("Yes");
		}else if(hmap.get(list.get(0)) == 3 && hmap.get(list.get(1)) == 2){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
