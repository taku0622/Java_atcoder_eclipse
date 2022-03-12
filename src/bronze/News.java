package bronze;

public class News {
	static int id;
	String name;

	void printInfo() {
		System.out.println(id +":"+name);
	}

	public static void main(String[] args) {
		News news = new News();
		news.printInfo();
	}

}
