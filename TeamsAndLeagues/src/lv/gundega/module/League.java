package lv.gundega.module;

import java.util.ArrayList;

public class League {

	private String nameOfLeague;
	private ArrayList <Team> nameOfTeams;
	
	
	public League (String leagueName){
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
	
	
	@Override
	public String toString() {
		return "League [nameOfLeague=" + nameOfLeague + ", nameOfTeams="
				+ nameOfTeams + "]";
	}
	
	
}
