package udemy01;
class Ex1_12_1 {
	public static void main (String[] args) {
		int point = Integer.parseInt(args[0]);
		String ans = "red";
		if(point >= 0 && point <= 100) {
			if(point >= 80) {
				ans = "excelent";
				if(point == 100) ans += "\npass home work!";
			}else if(point >= 60) {
				ans = "good";
			}else {
				ans = "red point";
			}
		}else {
			ans = "illegal point";
		}
		System.out.println(ans);
	}
}
