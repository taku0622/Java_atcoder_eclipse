package jp.atcoder;

import java.util.ArrayList;
import java.util.Collections;

public class ABC390_A2 {

    public static void main(String[] args) {
        // 元の配列
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5);

        // 全順列を計算して表示
        generatePermutations(numbers, 0);
    }

    // 順列を生成する再帰関数
    private static void generatePermutations(ArrayList<Integer> numbers, int start) {
        // 全ての数字を固定したら、結果を表示
        if (start == numbers.size() - 1) {
        	String s = numbers.get(0) + " " + numbers.get(1) + " " + numbers.get(2) + " " + numbers.get(3) + " " + numbers.get(4) + " ";

        	int count = 0;
    		for(int i=0;i<4;i++) {
    			int a = numbers.get(i);
    			int b = numbers.get(i+1);
    			if(a > b) {
    				count++;
    			}
    		}

    		String ans = count == 1 ? "Yes" : "No";
            System.out.println(s + ": " + ans);
            return;
        }

        // 各位置で数字を入れ替えながら順列を生成
        for (int i = start; i < numbers.size(); i++) {
            Collections.swap(numbers, start, i); // 数字をスワップ
            generatePermutations(numbers, start + 1); // 再帰呼び出し
            Collections.swap(numbers, start, i); // 元に戻す（バックトラック）
        }
    }
}
