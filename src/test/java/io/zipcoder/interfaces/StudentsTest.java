package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getInstance() {

        Students students = Students.getInstance();
        Integer count = students.count();
        Assert.assertEquals(count, (Integer) 8);
    }
}