package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {
    @Test
    public void testImplementation() {

        Assert.assertTrue(Educator.ChrisNobles instanceof Teacher);

    }

}