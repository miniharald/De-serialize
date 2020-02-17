package com.company.objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HockeyTeam implements Serializable {

    private String id;
    private String name;
    private List<HockeyPlayer> roster;

    public HockeyTeam(String name) {
        this.id = generateId();
        this.name = name;
        this.roster = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<HockeyPlayer> getRoster() {
        return roster;
    }

    private String generateId() {
        return String.valueOf(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        String displayRoster = "";
        for (HockeyPlayer player : roster) {
            displayRoster += player + "\n";
        }
        return String.format("%s:\n%s", name, displayRoster);
    }
}
