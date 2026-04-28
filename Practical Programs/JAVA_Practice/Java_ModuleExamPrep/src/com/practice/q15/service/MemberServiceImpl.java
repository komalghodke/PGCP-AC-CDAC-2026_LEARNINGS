package com.practice.q15.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.q15.dao.MemberDAO;
import com.practice.q15.model.GymMember;

public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;

	public MemberServiceImpl(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public void addMember(GymMember member) {
		memberDAO.addMember(member);
	}

	@Override
	public void updateFees(int memberId, double newFees) {
		GymMember gm = memberDAO.getMemberById(memberId);
		if (gm != null)
			gm.setFees(newFees);
	}

	@Override
	public void toggleStatus(int memberId) {
		GymMember gm = memberDAO.getMemberById(memberId);
		if (gm != null) {
			gm.setStatus(gm.getStatus().equals("Active") ? "Inactive" : "Active");
		}
	}

	@Override
	public void assignMembership(int memberId) {
		GymMember gm = memberDAO.getMemberById(memberId);
		if (gm != null) {
			if (gm.getPlanType().equalsIgnoreCase("Regular") && gm.getFees() < 5000) {
				gm.setStatus("Active");
			} else if (gm.getPlanType().equalsIgnoreCase("Premium") && gm.getFees() >= 5000) {
				gm.setStatus("Active");
			} else {
				gm.setStatus("Inactive");
			}
		}
	}

	@Override
	public List<GymMember> getAllMembers() {
		return memberDAO.getAllMembers();
	}

	@Override
	public List<GymMember> getMembersByType(String type) {
		return memberDAO.getAllMembers().stream().filter(m -> m.getPlanType().equalsIgnoreCase(type))
				.collect(Collectors.toList());
	}

	@Override
	public List<GymMember> getMembersByFees(double minFees) {
		return memberDAO.getAllMembers().stream().filter(m -> m.getFees() > minFees).collect(Collectors.toList());
	}

	@Override
	public List<GymMember> sortByFees() {
		return memberDAO.getAllMembers().stream().sorted(Comparator.comparingDouble(GymMember::getFees))
				.collect(Collectors.toList());
	}

	@Override
	public GymMember searchByName(String name) {
		return memberDAO.getAllMembers().stream().filter(m -> m.getMemberName().equalsIgnoreCase(name)).findFirst()
				.orElse(null);
	}

	@Override
	public void removeMember(int memberId) {
		memberDAO.removeMember(memberId);
	}
}
