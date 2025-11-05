package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Valuable{
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public List<Valuable> getAssets() {
        return assets;
    }

    //returns the total net value of all assets
    @Override
    public double getValue(){
        double total = 0.0;
        for (Valuable v : assets){
            total += v.getValue();
        }
        return total;
    }

    //returns asset with the highest value
    public Valuable getMostValuable(){
        if (assets.isEmpty()) return null;

        Valuable max = assets.get(0);
        for (Valuable v: assets){
            if (v.getValue() > max.getValue()){
                max = v;
            }
        }
        return max;
    }

    //returns asset with the lowest value
    public Valuable getLeastValuable(){
        if (assets.isEmpty()) return null;

        Valuable least = assets.get(0);
        for (Valuable v : assets){
            if (v.getValue() < least.getValue()){
                least = v;
            }
        }
        return least;
    }


}
