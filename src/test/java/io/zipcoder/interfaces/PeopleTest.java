package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void testImplementation() {
        People students = Students.getInstance();
        Assert.assertTrue(students instanceof Iterable);

    }
}