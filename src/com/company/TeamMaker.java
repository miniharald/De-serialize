package com.company;

import com.company.objects.Goalie;
import com.company.objects.HockeyTeam;
import com.company.objects.Skater;

class TeamMaker {

    private Program program;
    //private HockeyTeam team = new HockeyTeam("Dream Team");
    private HockeyTeam team2 = new HockeyTeam("MIF Legends");

    TeamMaker(Program program) {
        this.program = program;
    }

    void createTeam() {
        addPlayersToTeam(team2);
        addTeamToList(team2);
    }

    private void addPlayersToTeam(HockeyTeam team) {
        /*team.getRoster().add(new Goalie("Patrick Roy"));
        team.getRoster().add(new Skater("Ray Bourque"));
        team.getRoster().add(new Skater("Nicklas Lidström"));
        team.getRoster().add(new Skater("Peter Forsberg"));
        team.getRoster().add(new Skater("Mats Sundin"));
        team.getRoster().add(new Skater("Maurice Richard"));*/
        team2.getRoster().add(new Goalie("Roger Nordström"));
        team2.getRoster().add(new Skater("Robert Svehla"));
        team2.getRoster().add(new Skater("Peter Andersson"));
        team2.getRoster().add(new Skater("Juha Riihijärvi"));
        team2.getRoster().add(new Skater("Raimo Helminen"));
        team2.getRoster().add(new Skater("Robert Burakovsky"));
    }

    private void addTeamToList(HockeyTeam team) {
        program.getTeams().add(team);
    }
}
