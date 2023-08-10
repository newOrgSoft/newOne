package org.example;

import org.example.components.BuildingComponent;
import org.example.components.UserComponent;
import org.example.constants.UserTypes;
import exceptions.BuildingNotFoundException;
import exceptions.UserTypeException;

import java.util.Scanner;

public class Solution {

    private static UserComponent userComponent = new UserComponent();
    private static BuildingComponent buildingComponent = new BuildingComponent();

    public static void showOwnerMenu(String username){
        System.out.println("Owner Menu:");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("please select from the following: ");
            System.out.println("1- add a building to the system");
            System.out.println("2- add floors to the system");
            System.out.println("3- add house to the system");
            System.out.println("4- add photos to a house");
            System.out.println("5- update house services");
            System.out.println("6- update house location");
            System.out.println("7- update house price");
            System.out.println("8- exit");
            int option = scanner.nextInt();
            if(option == 1){
                System.out.println("please enter the building id: ");
                Integer buildingID = scanner.nextInt();
                System.out.println("please enter the building location: ");
                String location = scanner.next();
                buildingComponent.addBuilding(buildingID, location, username);
                System.out.println("ADDED SUCCESSFULLY");
            }
            else if (option == 2){
                System.out.println("please enter the building id: ");
                Integer buildingID = scanner.nextInt();
                System.out.println("please enter the floor num: ");
                String floorNum = scanner.next();
                try {
                    buildingComponent.addFloor(buildingID, floorNum, username);
                    System.out.println("ADDED SUCCESSFULLY");
                }catch (BuildingNotFoundException exception){
                    System.out.println("Building does not exist");
                }
            }
            else if (option == 3){
                System.out.println("please enter the building id: ");
                Integer buildingID = scanner.nextInt();
                System.out.println("please enter the floor num: ");
                String floorNum = scanner.next();
                System.out.println("please enter the house ID: ");
                Integer houseID = scanner.nextInt();
                System.out.println("please enter the price: ");
                Integer price = scanner.nextInt();
                try {
                    buildingComponent.addHouse(houseID, buildingID, floorNum, price, username);
                } catch (BuildingNotFoundException e){
                    System.out.println("Building not found");
                }
            }
            else if (option == 4){

            }
            else if (option == 5){
                return;
            }
        }
    }

    public static void showTenantMenu(String username){
        System.out.println("Tenant Menu:");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("please select from the following: ");
            System.out.println("1- sign in");
            System.out.println("1- sign in");
            System.out.println("1- sign in");
            System.out.println("1- sign in");
            System.out.println("5- exit");
            int option = scanner.nextInt();
            if(option == 1){

            }
            else if (option == 2){

            }
            else if (option == 3){

            }
            else if (option == 4){

            }
            else if (option == 5){
                return;
            }
        }
    }



    public static void showUserMenu(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("please select from the following: ");
            System.out.println("1- sign in");
            System.out.println("2- sign up");
            int selection = scanner.nextInt();
            if(selection == 1){
                System.out.println("please enter the username: ");
                String username = scanner.next();
                System.out.println("please enter the password: ");
                String password = scanner.next();
                if (userComponent.authenticate(username, password)){
                    System.out.println("Login Successful !!");
                    try {
                        if(userComponent.getUserType(username).equals(UserTypes.OWNER)){
                            showOwnerMenu(username);
                        }
                        else{
                            showTenantMenu(username);
                        }
                    }catch (UserTypeException exception){
                        System.out.println("There is an error happened");
                    }
                }
                else {
                    System.out.println("wrong username or password");
                }
            }
            else if(selection == 2){
                System.out.println("please enter the username: ");
                String username = scanner.next();
                System.out.println("please enter the password: ");
                String password = scanner.next();
                System.out.println("what are you ? owner or tenant");
                String type = scanner.next().toUpperCase();
                try{
                    userComponent.createUser(username, password, type);
                } catch (UserTypeException userTypeException){
                    System.out.println("Entered Type is not allowed");
                }


            }
        }
    }


    public static void main(String []args) {
        showUserMenu();
    }

}
