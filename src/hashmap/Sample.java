package hashmap;

import java.util.HashMap;
public class Sample {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new java.util.HashMap<String, Integer>();
		String nengo[] = {"明治", "大正", "昭和", "平成"};
		hm.put(nengo[0], 1868);
		hm.put(nengo[1], 1912);
		hm.put(nengo[2], 1926);
		hm.put(nengo[3], 1980);
		for(String s:nengo) {
			System.out.println(s+"元年は、西暦 " + hm.get(s) + "年");
		}
	}

}
