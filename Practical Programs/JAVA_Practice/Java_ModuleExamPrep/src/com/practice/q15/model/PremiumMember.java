package com.practice.q15.model;

public class PremiumMember extends GymMember {
	private String dietPlan;
	private String personalTrainer;

	public PremiumMember(int memberId, String memberName, String planType, double fees, String status, String dietPlan,
			String personalTrainer) {
		super(memberId, memberName, planType, fees, status);
		this.dietPlan = dietPlan;
		this.personalTrainer = personalTrainer;
	}

	@Override
	public String toString() {
		return super.toString() + ", DietPlan: " + dietPlan + ", PersonalTrainer: " + personalTrainer;
	}
}
