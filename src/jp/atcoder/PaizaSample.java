package jp.atcoder;

import java.util.ArrayList;

public class PaizaSample {
	public static void main(String[] args) {
		// ★int 1行
//		String str1;
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			str1 = br.readLine();
//		}catch (Exception e) {
//			System.out.println("Input Error!!");
//			return;
//		}
//		String[] sa = str1.split(" ");
//		ArrayList<Integer> il = new ArrayList<Integer>();
//		for(String s:sa) {
//			il.add(Integer.parseInt(s));
//		}
//		aWeakBeats(il);

		// ★String 1行
//		String str1;
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			str1 = br.readLine();
//		}catch (Exception e) {
//			System.out.println("Input Error!!");
//			return;
//		}
//		String[] sa = str1.split(" ");
//		ArrayList<String> sl = new ArrayList<String>();
//		for(String s:sa) {
//			sl.add(s);
//		}
//		aWeakBeats(sl);

		// ★int 2行
//		String str1;
//		String str2;
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			str1 = br.readLine();
//			str2 = br.readLine();
//		}catch (Exception e) {
//			System.out.println("Input Error!!");
//			return;
//		}
//		String[] sa = str1.split(" ");
//		ArrayList<Integer> il1 = new ArrayList<Integer>();
//		for(String s:sa) {
//			il1.add(Integer.parseInt(s));
//		}
//		String[] sa2 = str2.split(" ");
//		ArrayList<Integer> il2 = new ArrayList<Integer>();
//		for(String s:sa2) {
//			il2.add(Integer.parseInt(s));
//		}
//		aSame(il1,il2);

		// ★String 2行
//		String str1;
//		String str2;
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			str1 = br.readLine();
//			str2 = br.readLine();
//		}catch (Exception e) {
//			System.out.println("Input Error!!");
//			return;
//		}
//		String[] sa = str1.split(" ");
//		ArrayList<String> sl1 = new ArrayList<String>();
//		for(String s:sa) {
//			sl1.add(s);
//		}
//		String[] sa2 = str2.split(" ");
//		ArrayList<String> il2 = new ArrayList<String>();
//		for(String s:sa2) {
//			sl2.add(s);
//		}
//		aSame(sl1,sl2);

		// ★int 1行
		// ★String 1行
//		String str1;
//		String str2;
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			str1 = br.readLine();
//			str2 = br.readLine();
//		}catch (Exception e) {
//			System.out.println("Input Error!!");
//			return;
//		}
//		String[] sa = str1.split(" ");
//		ArrayList<Integer> il1 = new ArrayList<Integer>();
//		for(String s:sa) {
//			il1.add(Integer.parseInt(s));
//		}
//		String[] sa2 = str2.split(" ");
//		ArrayList<String> sl2 = new ArrayList<String>();
//		for(String s:sa2) {
//			sl2.add(s);
//		}
//		aSame(il1,sl2);

		// ★String 1行
		// ★int 1行
//		String str1;
//		String str2;
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			str1 = br.readLine();
//			str2 = br.readLine();
//		}catch (Exception e) {
//			System.out.println("Input Error!!");
//			return;
//		}
//		String[] sa = str1.split(" ");
//		ArrayList<String> sl1 = new ArrayList<String>();
//		for(String s:sa) {
//			sl1.add(s);
//		}
//		String[] sa2 = str2.split(" ");
//		ArrayList<Integer> il2 = new ArrayList<Integer>();
//		for(String s:sa2) {
//			il2.add(Integer.parseInt(s));
//		}
//		aSame(sl1,il2);
	}
	private static void aSame(ArrayList<Integer> il1, ArrayList<Integer> il2) {
		int n = il1.get(0);
		// for文
//		for(int i=0;i<n-1;i++) {
//			if(il2.get(i) != il2.get(i+1)) {
//				System.out.println("No");
//				return;
//			}
//		}

		// 拡張for文
//		for(String s:sl1) {
//			sl1.add(s);
//		}

		// if文
//		if(il.get(i)!=0) {
//			ans = "No";
//			break;
//		}

		// if for
//		for(int i=0;i<il.size()-1;i++) {
//			if(il.get(i) > il.get(i+1)) {
//				ans = "Yes";
//			} else {
//				ans = "No";
//				break;
//			}
//		}

		// switch
//		switch(num){
//		  case 5:
//		    System.out.println("一等賞");
//		    break;
//		  case 2:
//		    System.out.println("二等賞");
//		    break;
//		  default:
//		    System.out.println("残念賞");
//			break;
//		}
		System.out.println("Yes");
	}
}