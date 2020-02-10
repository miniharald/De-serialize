package com.company.objects;

import java.io.Serializable;

class HockeyPlayer implements Serializable {

    private String id;
    private String name;

    HockeyPlayer(String name) {
        this.id = generateId();
        this.name = name;
    }

    private String generateId() {
        return String.valueOf(System.currentTimeMillis());
    }
}
