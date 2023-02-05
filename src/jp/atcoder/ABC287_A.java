package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC287_A {

	public static void main(String[] args) {
		String str1;
		ArrayList<String> sl = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			String[] sa = str1.split(" ");
			for(int i=0;i<Integer.parseInt(sa[0]);i++) {
				String str = br.readLine();
				sl.add(str);
			}
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		aMajority(sl);
	}
	private static void aMajority(ArrayList<String> sl) {
		String ans = "Yes";
		int count = 0;
		for(int i=0;i<sl.size();i++) {
			if(sl.get(i).equals("Against")) {
				count++;
			}
			if((sl.size()-1)/2 +1 == count) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
	}
}
