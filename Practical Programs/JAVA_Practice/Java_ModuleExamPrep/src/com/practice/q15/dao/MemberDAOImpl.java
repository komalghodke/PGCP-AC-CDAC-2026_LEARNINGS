package com.practice.q15.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.practice.q15.model.GymMember;

public class MemberDAOImpl implements MemberDAO {
	private LinkedHashMap<Integer, GymMember> members = new LinkedHashMap<>();

	@Override
	public void addMember(GymMember member) {
		members.put(member.getMemberId(), member);
	}

	@Override
	public void removeMember(int memberId) {
		members.remove(memberId);
	}

	@Override
	public GymMember getMemberById(int memberId) {
		return members.get(memberId);
	}

	@Override
	public List<GymMember> getAllMembers() {
		return new ArrayList<>(members.values());
	}
}
