package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ABC214_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		String str = br.readLine();
		String[] sa = str.split(" ");
		Map<Integer,Integer> tmap = new TreeMap<Integer,Integer>();
		for(int i=1;i<=sa.length;i++) {
			tmap.put(Integer.parseInt(sa[i-1]), i);
		}
		ArrayList<Integer> list = new ArrayList<Integer>(tmap.values());
 		System.out.println(list.get(list.size()-2));

	}

}
