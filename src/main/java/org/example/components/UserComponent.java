package org.example.components;

import org.example.data_containers.UserContainer;
import org.example.entities.User;
import exceptions.UserNotFoundException;
import exceptions.UserTypeException;

public class UserComponent {

    private UserContainer userContainer;

    public UserComponent(){
        userContainer = new UserContainer();
    }

    public boolean authenticate(String username, String password){
        return userContainer.authenticate(username, password);
    }

    public void createUser(String username, String password, String type) throws UserTypeException {
        userContainer.addUser(username, password, type);
    }

    public String getUserType(String username) throws UserTypeException {
        return userContainer.getUserType(username);
    }

    public User getUser(String username) throws UserNotFoundException {
        return userContainer.getUser(username);
    }

    public void clearUsers(){
        userContainer.clearUsers();
    }

}
