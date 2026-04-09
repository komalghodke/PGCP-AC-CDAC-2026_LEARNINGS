package com.assignments.q4.IplTeams;

/*
Player class
Stores playerid, pname, speciality (batsman, bowler, allrounder, wicketkeeper).
*/
public class Player {
	int playerId;
	String pname;
	String speciality;

	public Player(int playerId, String pname, String speciality) {
		this.playerId = playerId;
		this.pname = pname;
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "PlayerID: " + playerId + ", Name: " + pname + ", Speciality: " + speciality;
	}
}
