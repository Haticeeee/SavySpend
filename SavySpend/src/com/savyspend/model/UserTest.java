package com.savyspend.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void testUserProperties() {
        User user = new User("John Doe", 5000.0, 3000.0);

        assertEquals("John Doe", user.getName());
        assertEquals(5000.0, user.getIncome(), 0.0);
        assertEquals(3000.0, user.getExpenses(), 0.0);
    }
}

