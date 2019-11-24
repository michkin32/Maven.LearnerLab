package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        Person person = new Person(12l , "Bob");
        long expectedId = 12l;
        String expectedName = "Bob";
        Assert.assertEquals(expectedId, 12l);
        Assert.assertEquals(expectedName, "Bob");
    }
    @Test
    public void testSetName(){
        Person person = new Person(12l , "Bob");
        String expectedName = "Joe";

        person.setName("Joe");

        Assert.assertEquals(expectedName, "Joe");
    }

}
