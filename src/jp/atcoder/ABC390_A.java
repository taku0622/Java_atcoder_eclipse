package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC390_A {

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
		a12435(il);
	}
	private static void a12435(ArrayList<Integer> il) {
		// pattern
		int[] arr1 = {1,2,3,5,4};
		int[] arr2 = {1,2,4,3,5};
		int[] arr3 = {1,3,2,4,5};
		int[] arr4 = {2,1,3,4,5};

		boolean allFlag = false;
		// arr1
		boolean flag = true;
		for(int i=0;i<4;i++) {
			if(arr1[i] != il.get(i)) {
				flag = false;
			}
		}
		if(flag) allFlag = true;

		// arr2
		flag = true;
		for(int i=0;i<4;i++) {
			if(arr2[i] != il.get(i)) {
				flag = false;
			}
		}
		if(flag) allFlag = true;

		// arr3
		flag = true;
		for(int i=0;i<4;i++) {
			if(arr3[i] != il.get(i)) {
				flag = false;
			}
		}
		if(flag) allFlag = true;

		// arr4
		flag = true;
		for(int i=0;i<4;i++) {
			if(arr4[i] != il.get(i)) {
				flag = false;
			}
		}
		if(flag) allFlag = true;


		String ans = allFlag ? "Yes" : "No";
		System.out.println(ans);
	}
}
