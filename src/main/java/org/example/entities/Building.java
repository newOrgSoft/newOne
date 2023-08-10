package org.example.entities;

import java.util.List;

public class Building {
    String ownerUsername;
    Integer buildingID;
    private String location;
    private List<Floor> floors;

    public Building(Integer buildingID, String location, String ownerUsername, List<Floor> floors) {
        this.buildingID = buildingID;
        this.location =location;
        this.floors = floors;
        this.ownerUsername = ownerUsername;
    }

    public Integer getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(Integer buildingID) {
        this.buildingID = buildingID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public void addFloor(Floor floor){
        this.floors.add(floor);
    }

    public String getOwnerUsername() {
        return ownerUsername;
    }

    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }
}
