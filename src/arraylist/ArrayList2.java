package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> sl = new ArrayList<String>();
		sl.add("one");
		sl.add("two");
		sl.add("three");
		sl.add("four");
		sl.remove(3);
		System.out.println(sl);
//		for(String s:sl) {
//			System.out.println(s);
//		}

		ArrayList<Integer> il = new ArrayList<Integer>();
		il.add(3);
		il.add(5);
		il.add(7);
		il.add(1);
		il.add(0);
//		for(int i:il) {
//			System.out.println(i);
//		}
		// ソート
		Collections.sort(il);
		System.out.println(il);

		// 降順ソート
		il.remove(2);
		Collections.sort(il, Collections.reverseOrder());
		System.out.println(il);
	}

}
