package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC303_A {

	public static void main(String[] args) {
		String str1;
		String str2;
		String str3;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			str2 = br.readLine();
			str3 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa1 = str1.split(" ");
		String[] sa2 = str2.split("");
		String[] sa3 = str3.split("");
		ArrayList<Integer> il1 = new ArrayList<Integer>();
		for(String s:sa1) {
			il1.add(Integer.parseInt(s));
		}
		ArrayList<String> sl1 = new ArrayList<String>();
		for(String s:sa2) {
			sl1.add(s);
		}
		ArrayList<String> sl2 = new ArrayList<String>();
		for(String s:sa3) {
			sl2.add(s);
		}
		aContestResult(il1,sl1,sl2);
	}
	private static void aContestResult(ArrayList<Integer> il1,ArrayList<String> sl1,ArrayList<String> sl2) {
		boolean flag = false;

		for(int i=0; i<il1.get(0); i++) {
			if(sl1.get(i).equals(sl2.get(i))) {
				flag = true;
			}else if((sl1.get(i).equals("1") && sl2.get(i).equals("l")) || (sl2.get(i).equals("1") && sl1.get(i).equals("l"))){
				flag = true;
			}else if((sl1.get(i).equals("0") && sl2.get(i).equals("o")) || (sl2.get(i).equals("0") && sl1.get(i).equals("o"))){
				flag = true;
			}else {
				flag = false;
				break;
			}
		}

		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
