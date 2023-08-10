package org.example.data_containers;

import org.example.entities.Building;
import org.example.entities.Floor;
import exceptions.BuildingNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class BuildingContainer {
    List<Building> buildingList;

    public BuildingContainer() {
        buildingList = new ArrayList<>();
    }

    public List<Building> getAllBuildings(){
        return this.buildingList;
    }

    public Building getBuilding(Integer buildingID) throws BuildingNotFoundException {
        for (Building building: buildingList) {
            if (building.getBuildingID().equals(buildingID)){
                return building;
            }
        }
        throw new BuildingNotFoundException();
    }

    public void addNewBuilding(Integer buildingID, String location, String owner, List<Floor> floors){
        buildingList.add(
                new Building(buildingID, location, owner, floors)
        );
    }

    public void clear(){
        this.buildingList.clear();
    }

}
