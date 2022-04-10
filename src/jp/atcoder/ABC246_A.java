package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC246_A {

	public static void main(String[] args) {
		String str1,str2,str3;
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
		String[] sa2 = str2.split(" ");
		String[] sa3 = str3.split(" ");
		String[][] arr = {sa1,sa2,sa3};
		forPoints(arr);
	}
	private static void forPoints(String[][] arr) {
		String[] ans = {"0","0"};
		if(arr[0][0].equals(arr[1][0])) ans[0] = arr[2][0];
		if(arr[0][0].equals(arr[2][0])) ans[0] = arr[1][0];
		if(arr[1][0].equals(arr[2][0])) ans[0] = arr[0][0];
		if(arr[0][1].equals(arr[1][1])) ans[1] = arr[2][1];
		if(arr[0][1].equals(arr[2][1])) ans[1] = arr[1][1];
		if(arr[1][1].equals(arr[2][1])) ans[1] = arr[0][1];
		System.out.println(ans[0] + " " + ans[1]);
	}
}
