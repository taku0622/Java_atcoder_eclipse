package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ABC205_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sa = str.split(" ");
		ArrayList<Integer> il = new ArrayList<Integer>();
		for(String s:sa) { il.add(Integer.parseInt(s)); }
		Collections.sort(il);
		System.out.println(il.get(1) + il.get(2));
	}
}
