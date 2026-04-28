package com.practice.q15.model;

public class RegularMember extends GymMember {
	private String trainerName;
	private int workoutHours;

	public RegularMember(int memberId, String memberName, String planType, double fees, String status,
			String trainerName, int workoutHours) {
		super(memberId, memberName, planType, fees, status);
		this.trainerName = trainerName;
		this.workoutHours = workoutHours;
	}

	@Override
	public String toString() {
		return super.toString() + ", Trainer: " + trainerName + ", Hours: " + workoutHours;
	}
}
