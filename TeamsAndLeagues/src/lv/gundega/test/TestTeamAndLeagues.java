package lv.gundega.test;

import java.util.ArrayList;

import lv.gundega.module.League;
import lv.gundega.module.Team;

public class TestTeamAndLeagues {

	public static void main(String[] args) {
		
		ArrayList<Team> khlTeam = new ArrayList<>();
		
				
		Team ska = new Team ("SKA");
		Team cska = new Team ("CSKA");
		Team dinamo = new Team ("DINAMO");
		Team spartak = new Team ("Spartak");
		Team torpedo = new Team ("Torpedo");
		Team jokerit = new Team ("Jokerit");
		
		
		khlTeam.add(ska);
		khlTeam.add(cska);
		khlTeam.add(dinamo);
		khlTeam.add(spartak);
		khlTeam.add(torpedo);
		khlTeam.add(jokerit);
		
//		for (Team t : khlTeam) {
//			System.out.println(t.getName());
//			}
		
		
		League khl = new League ("KHL");
		
		khl.setNameOfTeams(khlTeam);
		
		khl.recordWinAndLoss("CSKA", "DINAMO");
		khl.recordWinAndLoss("SKA", "DINAMO");
		khl.recordWinAndLoss("DINAMO", "SKA");
		khl.recordWinAndLoss("DINAMO", "Jokerit");
		
		khl.recordTies(torpedo, jokerit);
		khl.recordTies(cska, ska);
		
		
		System.out.println(khl.toString());
		
		

	}

}