package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC250_A {

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
		String[] sa1 = str1.split(" ");
		String[] sa2 = str2.split(" ");
		ArrayList<Integer> il1 = new ArrayList<Integer>();
		ArrayList<Integer> il2 = new ArrayList<Integer>();
		for(String s:sa1) {
			il1.add(Integer.parseInt(s));
		}
		for(String s:sa2) {
			il2.add(Integer.parseInt(s));
		}
		adjacentSquares(il1,il2);
	}
	private static void adjacentSquares(ArrayList<Integer> il1,ArrayList<Integer> il2) {
		int a = il1.get(0);
		int b = il1.get(1);
		int c = il2.get(0);
		int d = il2.get(1);
		ArrayList<String> aList = new ArrayList<String>();
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				String string = "[" + (i+1) + "," + (j+1) + "]";
				aList.add(string);
			}
		}
//		System.out.println(aList);
		String up = "[" + (c-1) + "," + (d) + "]";
		String right = "[" + (c) + "," + (d+1) + "]";
		String down = "[" + (c+1) + "," + (d) + "]";
		String left = "[" + (c) + "," + (d-1) + "]";
		int count = 0;
		if(aList.contains(up)) count++;
		if(aList.contains(right)) count++;
		if(aList.contains(down)) count++;
		if(aList.contains(left)) count++;
		System.out.println(count);
	}
}
