package com.jw.xml.models;

public class Country {

    private String name;

    private int tier; // importance of this country, lowest = highest.

    public Country(String name, int tier) {
        this.name = name;
        this.tier = tier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
