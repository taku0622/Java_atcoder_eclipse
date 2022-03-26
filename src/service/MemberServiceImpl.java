package service;

import java.util.ArrayList;

import entity.Member;

public class MemberServiceImpl implements MemberService {

	@Override
	public String greet(int i) {
		String greeting = {"Good moring","Hello","Good evening"};
		return greeting[i];
	}

	@Override
	public ArrayList<Member> getAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
