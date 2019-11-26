package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {
    ZipCodeWilmington zipCodeWilmington;
    @Before
    public void setup(){
        zipCodeWilmington = new ZipCodeWilmington();
    }

    @Test
    public void hostLecture() {

        zipCodeWilmington.hostLecture(11l, 40);
        Student[] sArray = zipCodeWilmington.students.toArray();
        for (Student s : sArray) {
            Assert.assertEquals(s.totalStudyTime, 5.0,.1);

        }
    }
}