package udemy01;
import java.math.BigDecimal;
import java.math.RoundingMode;

/*-< 演習：Ex1_15_1 >---------------------------------
BigDecimalの扱いについてAPIドキュメントなどで調べながら
以下の結果が表示されるプログラムを作ってみましょう！
----------------------------------------------------*/

class Ex1_15_1{
	public static void main (String[] args) {

		//(1) 0.2 * 83 - 10.6


		System.out.println(0.2 * 83 - 10.6);



		//(2) 0.2 * 83 - 10.6 / 3　※小数第4位までで表示（小数第5位以下は四捨五入）
		//<補足>
		// BigDecimalによる割り算は丸めの指定が必要です！
		// XXX ÷ YYYをして小数第2位で表示（小数第3位以下は切り捨て）
		// XXX.divide(YYY, 2, RoundingMode.DOWN);

		double val = 0.2 * 83 - 10.6 / 3;
		System.out.println(val);
		BigDecimal bigDecimal = new BigDecimal(String.valueOf(val));
		double v4 = bigDecimal.setScale(4, RoundingMode.HALF_UP).doubleValue();

		System.out.println(v4);





	}
}
