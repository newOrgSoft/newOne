package org.example.acceptese;

import org.example.components.BuildingComponent;
import org.example.components.UserComponent;
import org.example.constants.UserTypes;
import org.example.entities.Building;
import org.example.entities.Floor;
import org.example.entities.House;
import exceptions.BuildingNotFoundException;
import exceptions.UserTypeException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BuildingTests {
    private static BuildingComponent buildingComponent;
    private static UserComponent userComponent;

    @BeforeClass
    public static void createComponents(){
        buildingComponent = new BuildingComponent();
        userComponent = new UserComponent();
    }

    @Before
    public void createPrerequisites() throws UserTypeException {
        userComponent.createUser("sal", "123", UserTypes.OWNER);

    }

    @After
    public void clearElements(){
        userComponent.clearUsers();
        buildingComponent.clearBuildings();
    }

    @Test
    public void createBuildingTest(){
        buildingComponent.addBuilding(53, "Nablus-Rafidia", "sal");
        try {
            Building building = buildingComponent.getBuilding(53);
            assertEquals(53, (int)building.getBuildingID());
            assertEquals("Nablus-Rafidia", building.getLocation());
            assertEquals("sal", building.getOwnerUsername());
        } catch (BuildingNotFoundException e){
            fail();
        }
    }

    @Test
    public void addFloor(){
        buildingComponent.addBuilding(53, "Nablus-Rafidia", "sal");
        try {
            buildingComponent.addFloor(53, "GF", "sal");
            Building building = buildingComponent.getBuilding(53);
            List<Floor> floorList = building.getFloors();
            assertEquals(1, floorList.size());
            assertEquals("GF", floorList.get(0).getFloorNum());
        } catch (BuildingNotFoundException e){
            fail();
        }
    }


    @Test
    public void addMultipleFloors(){
        buildingComponent.addBuilding(53, "Nablus-Rafidia", "sal");
        try {
            buildingComponent.addFloor(53, "GF", "sal");
            buildingComponent.addFloor(53, "1st", "sal");
            buildingComponent.addFloor(53, "2nd", "sal");
            buildingComponent.addFloor(53, "3rd", "sal");
            Building building = buildingComponent.getBuilding(53);
            List<Floor> floorList = building.getFloors();
            assertEquals(4, floorList.size());
            assertEquals("GF", floorList.get(0).getFloorNum());
            assertEquals("1st", floorList.get(1).getFloorNum());
            assertEquals("2nd", floorList.get(2).getFloorNum());
            assertEquals("3rd", floorList.get(3).getFloorNum());

        } catch (BuildingNotFoundException e){
            fail();
        }
    }

    @Test
    public void addHouse(){
        buildingComponent.addBuilding(53, "Nablus-Rafidia", "sal");
        try {
            buildingComponent.addFloor(53, "GF", "sal");
            buildingComponent.addHouse(1, 53, "GF", 250, "sal");
            Building building = buildingComponent.getBuilding(53);
            House house = building.getFloors().get(0).getHouses().get(0);
            assertEquals(1, building.getFloors().get(0).getHouses().size());
            assertEquals(Integer.valueOf(250), house.getPrice());
            assertEquals(Integer.valueOf(1), house.getHouseID());
        } catch (BuildingNotFoundException e){
            fail();
        }
    }

    @Test
    public void addMultipleHouses(){
        buildingComponent.addBuilding(53, "Nablus-Rafidia", "sal");
        try {
            buildingComponent.addFloor(53, "GF", "sal");
            buildingComponent.addHouse(1, 53, "GF", 250, "sal");
            buildingComponent.addHouse(2, 53, "GF", 260, "sal");
            buildingComponent.addHouse(3, 53, "GF", 270, "sal");
            buildingComponent.addHouse(4, 53, "GF", 280, "sal");
            Building building = buildingComponent.getBuilding(53);
            assertEquals(4, building.getFloors().get(0).getHouses().size());
            assertEquals( Integer.valueOf(250), building.getFloors().get(0).getHouses().get(0).getPrice());
            assertEquals( Integer.valueOf(1), building.getFloors().get(0).getHouses().get(0).getHouseID());

            assertEquals( Integer.valueOf(260), building.getFloors().get(0).getHouses().get(1).getPrice());
            assertEquals( Integer.valueOf(2), building.getFloors().get(0).getHouses().get(1).getHouseID());

            assertEquals( Integer.valueOf(270), building.getFloors().get(0).getHouses().get(2).getPrice());
            assertEquals( Integer.valueOf(3), building.getFloors().get(0).getHouses().get(2).getHouseID());

            assertEquals( Integer.valueOf(280), building.getFloors().get(0).getHouses().get(3).getPrice());
            assertEquals( Integer.valueOf(4), building.getFloors().get(0).getHouses().get(3).getHouseID());
        } catch (BuildingNotFoundException e){
            fail();
        }
    }

}
