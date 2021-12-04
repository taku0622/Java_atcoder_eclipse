package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ABC228_B {

	public static void main(String[] args) {
		String str1;
		String str2;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			str2 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa1 = str1.split(" ");
		String[] sa2 = str2.split(" ");
		List<Integer> il1 = new ArrayList<Integer>();
		for(int i=0;i<sa1.length;i++) { il1.add(Integer.parseInt(sa1[i])); }
		List<Integer> il2 = new ArrayList<Integer>();
		for(int i=0;i<sa2.length;i++) { il2.add(Integer.parseInt(sa2[i])); }
		int a = il1.get(0);
		int b = il1.get(1);
		tSecret(a,b,il2);
	}
	private static void tSecret(int a,int b,List<Integer> l) {
		// 判定リスト 0:知らない　1:知ってる
		List<Integer> judgeList = new ArrayList<>();
		for(int i=0;i<a;i++) { judgeList.add(0); }
		int ans=1;
		for(int i=0;i<=a;i++) {
			if(judgeList.get(b-1).equals(1)) {
				ans = i;
				break;
			}
			judgeList.set(b-1, 1);
			b = l.get(b-1);
//			System.out.println(b+"は知りました。");
		}
		System.out.println(ans);
	}

}
