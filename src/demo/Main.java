package demo;

import service.MemberServiceImpl;

public class Main {

	public static void main(String[] args) {
		MemberServiceImpl service = new  MemberServiceImpl();
		System.out.println(service.greet(2));

		System.out.println(service.getAll());
	}

}
