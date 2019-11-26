package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnInstructorsTest {

    @Test
    public void getInstance() {


        Assert.assertEquals(Instructors.getInstance().count(), (Integer) 5);
    }
}