package com.kikinsoft.mobile.leaguechampions.model;

/**
 * Created by fvelazquez on 8/22/15.
 */
public class Champion {

    private String url = "https://global.api.pvp.net/api/lol/static-data/na/v1.2/champion?champData=info&api_key=943aba1b-13b2-4728-8304-68672914377e";
    private double id;
    private String name;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
