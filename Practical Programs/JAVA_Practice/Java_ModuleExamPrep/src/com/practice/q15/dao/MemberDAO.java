package com.practice.q15.dao;

import java.util.List;

import com.practice.q15.model.GymMember;

public interface MemberDAO {
	void addMember(GymMember member);

	void removeMember(int memberId);

	GymMember getMemberById(int memberId);

	List<GymMember> getAllMembers();
}
