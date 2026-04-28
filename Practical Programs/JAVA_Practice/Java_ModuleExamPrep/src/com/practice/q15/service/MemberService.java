package com.practice.q15.service;

import java.util.List;

import com.practice.q15.model.GymMember;

public interface MemberService {
	void addMember(GymMember member);

	void updateFees(int memberId, double newFees);

	void toggleStatus(int memberId);

	void assignMembership(int memberId);

	List<GymMember> getAllMembers();

	List<GymMember> getMembersByType(String type);

	List<GymMember> getMembersByFees(double minFees);

	List<GymMember> sortByFees();

	GymMember searchByName(String name);

	void removeMember(int memberId);
}
