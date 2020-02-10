package com.company;

import com.company.objects.Goalie;
import com.company.objects.HockeyTeam;
import com.company.objects.Skater;

class TeamMaker {

    private Program program;

    TeamMaker(Program program) {
        this.program = program;
        //HockeyTeam team = new HockeyTeam("Dream Team");
        HockeyTeam team = new HockeyTeam("MIF Legends");
        addPlayersToTeam(team);
        addTeamToList(team);
    }

    private void addPlayersToTeam(HockeyTeam team) {
        /*team.getRoster().add(new Goalie("Patrick Roy"));
        team.getRoster().add(new Skater("Ray Bourque"));
        team.getRoster().add(new Skater("Nicklas Lidström"));
        team.getRoster().add(new Skater("Peter Forsberg"));
        team.getRoster().add(new Skater("Mats Sundin"));
        team.getRoster().add(new Skater("Maurice Richard"));*/
        team.getRoster().add(new Goalie("Roger Nordström"));
        team.getRoster().add(new Skater("Robert Svehla"));
        team.getRoster().add(new Skater("Peter Andersson"));
        team.getRoster().add(new Skater("Juha Riihijärvi"));
        team.getRoster().add(new Skater("Raimo Helminen"));
        team.getRoster().add(new Skater("Robert Burakovsky"));
    }

    private void addTeamToList(HockeyTeam team) {
        program.getTeams().add(team);
    }
}
