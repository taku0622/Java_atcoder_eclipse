package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ABC201_A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr1 = str.split(" ");
		int[] arr2 = new int[3];
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = Integer.parseInt(arr1[i]);
		}
		Arrays.sort(arr2);
		String ans = (arr2[1] - arr2[0]) == (arr2[2] - arr2[1]) ? "Yes" : "No";
		System.out.println(ans);
	}

}
