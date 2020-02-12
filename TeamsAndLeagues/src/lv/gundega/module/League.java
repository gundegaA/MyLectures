package lv.gundega.module;

import java.util.ArrayList;

public class League {

	private String nameOfLeague;
	private ArrayList<Team> nameOfTeams;

	public League(String leagueName) {
		this.nameOfLeague = leagueName;
		this.nameOfTeams = new ArrayList<>();
	}

	public String getNameOfLeague() {
		return nameOfLeague;
	}

	public void setNameOfLeague(String nameOfLeague) {
		this.nameOfLeague = nameOfLeague;
	}

	public ArrayList<Team> getNameOfTeams() {
		return nameOfTeams;
	}

	public void setNameOfTeams(ArrayList<Team> nameOfTeams) {
		this.nameOfTeams = nameOfTeams;
	}

	public void recordWinAndLoss(String winnerName, String loserName) {

		Team winner;
		Team loser;

		winner = this.teamWithName(winnerName);
		loser = this.teamWithName(loserName);

		winner.wins++;
		loser.losses++;

	}

	public void recordTies(Team teamA, Team teamB) {

		teamA.ties++;
		teamB.ties++;

	}

	public Team teamWithName(String nameToLookFor) {

		Team teamCreated = null;

		for (Team team : this.nameOfTeams) {
			if (team.name.equals(nameToLookFor)) {
				teamCreated = team;
			}
		}
		return teamCreated;
	}

	@Override
	public String toString() {
		return "League [nameOfLeague=" + nameOfLeague + ", nameOfTeams=" + nameOfTeams + "]";
	}

}