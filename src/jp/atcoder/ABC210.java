package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC210 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sa = str.split(" ");
		int[] il = new int[4];
		for(int i=0;i<sa.length;i++) { il[i] = Integer.parseInt(sa[i]); }
		int ans = 0;
		for(int i=0;i<il[0];i++) {
			if(i>il[1]-1) {
				ans += il[3];
			}else {
				ans += il[2];
			}
		}
//		if(il[0] >= il[1]) {
//			ans += il[1] * il[2];
//			ans += (il[0]-il[1]) * il[3];
//		} else {
//			ans += il[1] * il[2];
//		}
		System.out.println(ans);
	}

}
