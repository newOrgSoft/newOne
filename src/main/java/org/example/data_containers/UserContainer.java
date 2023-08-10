package org.example.data_containers;

import org.example.constants.UserTypes;
import org.example.entities.Owner;
import org.example.entities.Tenant;
import org.example.entities.User;
import exceptions.UserNotFoundException;
import exceptions.UserTypeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserContainer {

    List<User> userList;

    public UserContainer(){
        userList = new ArrayList<>();
    }

    public void addUser(String username, String password, String type) throws UserTypeException {
        if(type.equals(UserTypes.OWNER)){
            this.userList.add(new Owner(username, password));
        }
        else if(type.equals(UserTypes.TENANT)){
            this.userList.add(new Tenant(username, password));
        }
        else{
            throw new UserTypeException();
        }
    }

    public User getUser(String username) throws UserNotFoundException {
        for( User user: userList){
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        throw new UserNotFoundException();
    }

    public void clearUsers(){
        userList.clear();
    }

    public boolean authenticate(String username, String password){
        for( User user: userList){
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public String getUserType(String username) throws UserTypeException {
        for(User user: userList){
            if(user.getClass().getSimpleName().equalsIgnoreCase(UserTypes.OWNER)){
                return UserTypes.OWNER;
            }
            else if(user.getClass().getSimpleName().equalsIgnoreCase(UserTypes.TENANT)){
                return UserTypes.TENANT;
            }
        }
        throw new UserTypeException();
    }

}
