package org.example.components;

import org.example.data_containers.BuildingContainer;
import org.example.data_containers.UserContainer;
import org.example.entities.Building;
import org.example.entities.Floor;
import org.example.entities.House;
import exceptions.BuildingNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class BuildingComponent {

    private BuildingContainer buildingContainer;

    public BuildingComponent(){
        buildingContainer = new BuildingContainer();
    }

    public Building getBuilding(Integer buildingID) throws BuildingNotFoundException {
        return buildingContainer.getBuilding(buildingID);
    }

    public void addBuilding(Integer buildingID, String location, String owner){
        buildingContainer.addNewBuilding(buildingID, location, owner, new ArrayList<>());
    }

    public void addFloor(Integer buildingID, String floorNum, String owner) throws BuildingNotFoundException {
        Building building = buildingContainer.getBuilding(buildingID);
        if(building.getOwnerUsername().equals(owner)){
            building.addFloor(new Floor(floorNum, new ArrayList<>()));
        }
        else{
            System.out.println("NOT ALLOWED");
        }
    }

    public void addHouse(Integer houseID, Integer buildingID, String floorNum, Integer price, String owner) throws BuildingNotFoundException {
        Building building = buildingContainer.getBuilding(buildingID);
        if(building.getOwnerUsername().equals(owner)){
            for (Floor floor: building.getFloors()) {
                if (floor.getFloorNum().equals(floorNum)){
                    floor.addHouse(new House(houseID, price, new ArrayList<>(), new ArrayList<>()));
                    return;
                }
            }
            System.out.println("Floor doesn't exist");
        }
        else{
            System.out.println("NOT ALLOWED");
        }
    }

    public void addPhotosToHouse(Integer buildingID, String floorNum, Integer houseID, String []photos) throws BuildingNotFoundException {
        Building building = this.buildingContainer.getBuilding(buildingID);
        for (Floor floor: building.getFloors()){
            if(floor.getFloorNum().equals(floorNum)){
                for(House house: floor.getHouses()){
                    if(house.getHouseID().equals(houseID)){
                        for (String photo : photos) {
                            house.getPhotos().add(photo);
                        }
                        System.out.println("Photos Added Successfully");
                        return;
                    }
                }
                System.out.println("House Not Found");
            }
        }
        System.out.println("Floor Not Found");
    }

    public void addServicesToHouse(Integer buildingID, String floorNum, Integer houseID, String []services) throws BuildingNotFoundException {
        Building building = this.buildingContainer.getBuilding(buildingID);
        for (Floor floor: building.getFloors()){
            if(floor.getFloorNum().equals(floorNum)){
                for(House house: floor.getHouses()){
                    if(house.getHouseID().equals(houseID)){
                        for (String service : services) {
                            house.getServices().add(service);
                        }
                        System.out.println("service Added Successfully");
                        return;
                    }
                }
                System.out.println("House Not Found");
            }
        }
        System.out.println("Floor Not Found");
    }

    public List<House> viewAllHouses(){
        List<House> houses = new ArrayList<>();
        List<Building> buildingList = this.buildingContainer.getAllBuildings();
        for (Building building : buildingList) {
            for(Floor floor: building.getFloors()){
                houses.addAll(floor.getHouses());
            }
        }
        return houses;
    }
    public void clearBuildings(){
        buildingContainer.clear();
    }
}
