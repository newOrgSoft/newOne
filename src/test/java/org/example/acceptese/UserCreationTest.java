package org.example.acceptese;

import org.example.components.UserComponent;
import org.example.constants.UserTypes;
import org.example.entities.User;
import exceptions.UserNotFoundException;
import exceptions.UserTypeException;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserCreationTest {

    private static UserComponent userComponent;
    @BeforeClass
    public static void createFunctionalities(){
        userComponent = new UserComponent();
    }

    @Test
    public void createTenantUser(){
        String username = "sal";
        String password = "123";
        try {
            userComponent.createUser(username, password, UserTypes.TENANT);
            try {
                User user = userComponent.getUser(username);
                assertEquals(username, user.getUsername());
                assertEquals(password, user.getPassword());
                assertEquals(UserTypes.TENANT, user.getClass().getSimpleName().toUpperCase());
            } catch (UserNotFoundException e){
                fail();
            }
        } catch (UserTypeException e){
            fail();
        }
    }

    @Test
    public void createOwnerUser(){
        String username = "sal";
        String password = "123";
        try {
            userComponent.createUser(username, password, UserTypes.OWNER);
            try {
                User user = userComponent.getUser(username);
                assertEquals(username, user.getUsername());
                assertEquals(password, user.getPassword());
                assertEquals(UserTypes.OWNER, user.getClass().getSimpleName().toUpperCase());
            } catch (UserNotFoundException e){
                fail();
            }
        } catch (UserTypeException e){
            fail();
        }
    }

    @Test
    public void createUserWithInvalidType(){
        String username = "sal";
        String password = "123";
        assertThrows(UserTypeException.class, () -> userComponent.createUser(username, password, "Invalid Type"));
    }

    @After
    public void clearUsers(){
        userComponent.clearUsers();
    }

}
