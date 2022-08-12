package com.company;

public class Singer extends Person{
    private String bandName;


    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println("Опера ырларын ырдайт");
    }

    public void playGitar() {
        System.out.println("Гитарада ойнойт");

    }

    public String toString() {
        return "Ырчынын аты " + getName() + "кылган иши " + designation + "топтун аты " + bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
