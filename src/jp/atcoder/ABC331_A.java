package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC331_A {

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
		String[] sa2 = str2.split(" ");
		ArrayList<Integer> il2 = new ArrayList<Integer>();
		for(String s:sa2) {
			il2.add(Integer.parseInt(s));
		}
		aTomorrow(il1,il2);
	}
	private static void aTomorrow(ArrayList<Integer> il1, ArrayList<Integer> il2) {
		int m = il1.get(0);
		int d = il1.get(1);
		int ny = il2.get(0);
		int nm = il2.get(1);
		int nd = il2.get(2);
		int ansY = 0;
		int ansM = 0;
		int ansD = 0;
		if(d == nd) {
			ansD = 1;
			if(m == nm) {
				ansM = 1;
				ansY = ny + 1;
				System.out.println(ansY + " " + ansM + " " + ansD);
				return;
			}
			ansM = nm + 1;
			ansY = ny;
			System.out.println(ansY + " " + ansM + " " + ansD);
			return;
		}
		ansY = ny;
		ansM = nm;
		ansD = nd + 1;
		System.out.println(ansY + " " + ansM + " " + ansD);
	}
}