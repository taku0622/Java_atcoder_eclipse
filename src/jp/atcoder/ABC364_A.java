package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC364_A {

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
		aGluttonTakahashi(sl);
	}
	private static void aGluttonTakahashi(ArrayList<String> sl) {
		boolean sweetFlag = false;
		int size = sl.size();
		for(int i =0; i < size; i++) {
			String value = sl.get(i);
			// 甘いが連続、かつ、最後じゃない場合、Noを出力
			if(sweetFlag && value.equals("sweet") && (i != (size-1)) ) {
//				System.out.println(i);
//				System.out.println(size-1);
				System.out.println("No");
				return;
			}
			sweetFlag = value.equals("sweet") ? true : false;
		}
		System.out.println("Yes");
	}
}
