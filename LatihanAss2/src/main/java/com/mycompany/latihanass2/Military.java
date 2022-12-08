package com.mycompany.latihanass2;

public class Military extends Aircraft implements Cargo {

    public String type;
    public String nation;

    public Military(String type, String nation) {
        this.type = type;
        this.nation = nation;
    }

    public String Military(String nation) {
        String tentara = nation;
        return tentara;
    }

    public String Military(String type, String nation) {
        String laut = type + nation;
        return laut;
    }

    public void shoot() {

    }

    @Override
    public void loadCargo() {
        
    }

    @Override
    public void unloadCargo() {

    }

}
