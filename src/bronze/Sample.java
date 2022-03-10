package bronze;

public class Sample {
	void fuga() {
		this.hoge();
	}
	private void hoge() {
		System.out.println("hoge");
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sample sample = new Sample();
		sample.fuga();
	}

}
