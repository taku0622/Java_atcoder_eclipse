package hashset;

import java.util.HashSet;

public class Sample {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("ichiro");
		hs.add("jiro");
		hs.add("taro");
		hs.add("jiro");
		hs.add("kenji");
		System.out.println(hs);
	}

}
