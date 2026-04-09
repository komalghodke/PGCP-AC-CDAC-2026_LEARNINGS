package com.assignments.q4.IplTeams;

/*
Team class
Stores teamid, tname, coachname, and list of players.
Provides functions to add/remove players and modify coach.
*/
import java.util.*;

public class Team {
	int teamId;
	String tname;
	String coachName;
	List<Player> players;

	public Team(int teamId, String tname, String coachName) {
		this.teamId = teamId;
		this.tname = tname;
		this.coachName = coachName;
		this.players = new ArrayList<>();
	}

	public void addPlayer(Player p) {
		players.add(p);
	}

	public void removePlayer(int pid) {
		players.removeIf(p -> p.playerId == pid);
	}

	public void displayPlayers() {
		for (Player p : players) {
			System.out.println(p);
		}
	}

	public void displayBatsmen() {
		for (Player p : players) {
			if (p.speciality.equalsIgnoreCase("batsman")) {
				System.out.println(p);
			}
		}
	}

	public void displayBySpeciality(String spec) {
		for (Player p : players) {
			if (p.speciality.equalsIgnoreCase(spec)) {
				System.out.println(p);
			}
		}
	}

	public void modifyCoach(String newCoach) {
		this.coachName = newCoach;
	}

	@Override
	public String toString() {
		return "TeamID: " + teamId + ", Team: " + tname + ", Coach: " + coachName;
	}
}