package org.example.acceptese;

import org.example.components.UserComponent;
import org.example.constants.UserTypes;
import org.example.data_containers.UserContainer;
import exceptions.UserTypeException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    private static UserComponent userComponent;
    @BeforeClass
    public static void createFunctionalities(){
        userComponent = new UserComponent();
    }

    @Before
    public void addUser() throws UserTypeException {
        String username = "salsabeel";
        String password = "123456";

        userComponent.createUser(username, password, UserTypes.TENANT);

    }

    @After
    public void clearUsers(){
        userComponent.clearUsers();
    }

    @Test
    public void testValidUserNameAndPassword(){
        assertTrue(userComponent.authenticate("salsabeel", "123456"));
    }

    @Test
    public void testValidUserNameAndInvalidPassword(){
        assertFalse(userComponent.authenticate("salsabeel", "1234"));
    }

    @Test
    public void testInvalidUserNameAndValidPassword(){
        assertFalse(userComponent.authenticate("salsab", "123456"));
    }

    @Test
    public void testInvalidUserNameAndInvalidPassword(){
        assertFalse(userComponent.authenticate("salsab", "1236"));
    }

}
