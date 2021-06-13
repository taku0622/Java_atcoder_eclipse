/**
 *
 */
package jp.atcoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author C0117253
 *
 */
public class ABC126 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();

		String[] arr1 = str1.split(" ", 2);
		String[] arr2 = str2.split("", Integer.parseInt(arr1[0]));
		arr2[Integer.parseInt(arr1[1])-1] = arr2[Integer.parseInt(arr1[1])-1].toLowerCase();

		String ans = "";
		for(int i = 0; i < arr2.length; i++) {
			ans += arr2[i];
		}
		System.out.println(ans);
	}
}
