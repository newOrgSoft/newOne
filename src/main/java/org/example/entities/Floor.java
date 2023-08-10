package org.example.entities;

import java.util.List;

public class Floor {
    private String FloorNum;
    private List<House> houses;

    public Floor(String floorNum, List<House> houses) {
        FloorNum = floorNum;
        this.houses = houses;
    }

    public String getFloorNum() {
        return FloorNum;
    }

    public void setFloorNum(String floorNum) {
        FloorNum = floorNum;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public void addHouse(House house){
        houses.add(house);
    }

}
