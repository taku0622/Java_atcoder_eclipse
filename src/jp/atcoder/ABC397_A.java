package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC397_A {

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
		ArrayList<Double> il = new ArrayList<Double>();
		for(String s:sa) {
			il.add(Double.parseDouble(s));
		}
		aThermometer(il);
	}
	private static void aThermometer(ArrayList<Double> il) {
		double value = il.get(0);
		if(value >= 38.0) {
			System.out.println(1);
			return;
		}
		if(value >= 37.5) {
			System.out.println(2);
			return;
		}
		if(value < 37.5) {
			System.out.println(3);
			return;
		}
	}
}
