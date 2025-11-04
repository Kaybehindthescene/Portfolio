package com.pluralsight.finance;

public class House extends FixedAsset{

    private int yearBuilt;
    private int squareFeet;
    private int bedRooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedRooms){
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    @Override
    public double getValue(){

        double ratePerSqFt = 200.0;

        double depreciationRate = 1000.0;

        double value = (getSquareFeet() * ratePerSqFt) - (getYearBuilt() * depreciationRate);

        return Math.max(0, value);

    }
}
