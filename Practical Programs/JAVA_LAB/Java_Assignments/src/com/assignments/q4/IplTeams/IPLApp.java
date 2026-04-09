package com.assignments.q4.IplTeams;

/*
IPLApp class
Main driver program with menu:
1. Add new Team
2. Delete a Team
3. Delete a Player from Team
4. Display all Batsman
5. Display all players with a speciality
6. Add a new Player in a Team
7. Modify coach of a Team
8. Exit
*/
import java.util.*;

public class IPLApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Team> teams = new ArrayList<>();

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Add new Team");
			System.out.println("2. Delete a Team");
			System.out.println("3. Delete a Player from Team");
			System.out.println("4. Display all Batsman");
			System.out.println("5. Display all players with a speciality");
			System.out.println("6. Add a new Player in a Team");
			System.out.println("7. Modify coach of a Team");
			System.out.println("8. Exit");
			System.out.print("Enter choice: ");
			int ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {
			case 1:
				System.out.print("Enter TeamID: ");
				int tid = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Team Name: ");
				String tname = sc.nextLine();
				System.out.print("Enter Coach Name: ");
				String cname = sc.nextLine();
				teams.add(new Team(tid, tname, cname));
				break;
			case 2:
				System.out.print("Enter TeamID to delete: ");
				int delTid = sc.nextInt();
				teams.removeIf(t -> t.teamId == delTid);
				break;
			case 3:
				System.out.print("Enter TeamID: ");
				int teamId = sc.nextInt();
				System.out.print("Enter PlayerID to delete: ");
				int pid = sc.nextInt();
				for (Team t : teams)
					if (t.teamId == teamId)
						t.removePlayer(pid);
				break;
			case 4:
				for (Team t : teams)
					t.displayBatsmen();
				break;
			case 5:
				System.out.print("Enter speciality: ");
				String spec = sc.nextLine();
				for (Team t : teams)
					t.displayBySpeciality(spec);
				break;
			case 6:
				System.out.print("Enter TeamID: ");
				int addTid = sc.nextInt();
				System.out.print("Enter PlayerID: ");
				int newPid = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Player Name: ");
				String pname = sc.nextLine();
				System.out.print("Enter Speciality: ");
				String pspec = sc.nextLine();
				Player p = new Player(newPid, pname, pspec);
				for (Team t : teams)
					if (t.teamId == addTid)
						t.addPlayer(p);
				break;
			case 7:
				System.out.print("Enter TeamID: ");
				int modTid = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter new Coach Name: ");
				String newCoach = sc.nextLine();
				for (Team t : teams)
					if (t.teamId == modTid)
						t.modifyCoach(newCoach);
				break;
			case 8:
				System.out.println("Exiting...");
				return;
			}
		}
	}
}
