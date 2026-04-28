package com.practice.q15.model;

public abstract class GymMember {
	protected int memberId;
	protected String memberName;
	protected String planType; // Regular / Premium
	protected double fees;
	protected String status; // Active / Inactive

	public GymMember(int memberId, String memberName, String planType, double fees, String status) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.planType = planType;
		this.fees = fees;
		this.status = status;
	}

	public int getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getPlanType() {
		return planType;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "MemberId: " + memberId + ", Name: " + memberName + ", Plan: " + planType + ", Fees: " + fees
				+ ", Status: " + status;
	}
}
