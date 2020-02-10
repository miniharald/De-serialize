package com.company;

import com.company.objects.HockeyTeam;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Program {

    private List<HockeyTeam> teams = new ArrayList<>();
    private Serializor serializor = new Serializor();
    private TeamMaker teamMaker;

    Program() {
        load();
        teamMaker = new TeamMaker(this);
        serializor.serialize("teams/" + teams.get(teams.size() - 1).getId() + ".ht", teams.get(0));
    }

    List<HockeyTeam> getTeams() {
        return teams;
    }

    private void load() {
        File folderPath = new File("teams/");
        for (File file : Objects.requireNonNull(folderPath.listFiles())) {
            String path = String.valueOf(file);
            teams.add((HockeyTeam) serializor.deserialize(path));
        }
    }
}
