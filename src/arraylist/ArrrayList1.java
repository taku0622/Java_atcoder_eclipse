package arraylist;

import java.util.ArrayList;

public class ArrrayList1 {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("taro", 1, 1));
		al.add(new Student("sho", 3, 2));
		al.add(new Student("jun", 2, 5));
		al.remove(2);
		for(Student s:al) {
			System.out.println("name : " + s.getName() + ",  grade : " + s.getGrade()
								+ ",  number : " + s.getNumber());
		}
	}
}
