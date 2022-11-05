package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC270_A {

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
		a124Test(il);
	}
	private static void a124Test(ArrayList<Integer> il) {
		// test pattern
		// 0    :0
		// 1    :1
		// 2    :2
		// 1-2  :3
		// 4    :4
		// 1-4  :5
		// 2-4  :6
		// 1-2-4:7
		// (0,0)0(0,1)1(0,2)2(0,3)3(0,4)4(0,5)5(0,6)6(0,7)7
		// (1,1)1(1,2)3(1,3)3(1,4)5(1,5)5(1,6)7(1,7)7
		// (2,2)2(2,3)3(2,4)6(2,5)7(2,6)6(2,7)7
		// (3,3)3(3,4)7(3,5)7(3,6)7(3,7)7
		// (4,4)4(4,5)5(4,6)6(4,7)7
		// (5,5)5(5,6)7(5,7)7
		// (6,6)6(6,7)7
		// (7,7)7
		// 0 :(0,0)								1
		// 1 :(0,1),(1,1)						3
		// 2 :(0,2),(2,2)						5
		// 3 :(0,3),(3,3),(1,2),(2,3),(1,3)		10
		// 4 :(0,4),(4,4)						12
		// 5 :(0,5),(5,5),(1,4),(1,5),(4,5)		17
		// 6 :(0,6),(6,6),(4,6),(2,4),(2,6) 	22
		// 7 :(0,7),(1,6),(1,7),(2,5),(2,7),(3,4),(3,5),(3,6),(3,7),(4,7),(5,6),(5,7),(6,7),(7,7)	36
		// ilの昇順の文字列作成
		String sortString = "(" + il.get(1) + "," + il.get(0) + ")";
		if(il.get(0) <= il.get(1)) {
			sortString = "(" + il.get(0) + "," + il.get(1) + ")";
		}
		// System.out.println(sortString);
		String string0 = "(0,0)";
		String string1 = "(0,1),(1,1)";
		String string2 = "(0,2),(2,2)";
		String string3 = "(0,3),(3,3),(1,2),(2,3),(1,3)";
		String string4 = "(0,4),(4,4)";
		String string5 = "(0,5),(5,5),(1,4),(1,5),(4,5)";
		String string6 = "(0,6),(6,6),(4,6),(2,4),(2,6)";
		String string7 = "(0,7),(1,6),(1,7),(2,5),(2,7),(3,4),(3,5),(3,6),(3,7),(4,7),(5,6),(5,7),(6,7),(7,7)";
		// ansの定義
		int ans = 0;
		if(string7.contains(sortString)) {
			ans = 7;
		}else if (string6.contains(sortString)) {
			ans = 6;
		}else if (string5.contains(sortString)) {
			ans = 5;
		}else if (string4.contains(sortString)) {
			ans = 4;
		}else if (string3.contains(sortString)) {
			ans = 3;
		}else if (string2.contains(sortString)) {
			ans = 2;
		}else if (string1.contains(sortString)) {
			ans = 1;
		}else {
			ans = 0;
		}
		System.out.println(ans);
	}
}
