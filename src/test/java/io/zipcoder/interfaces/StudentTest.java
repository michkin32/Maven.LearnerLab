package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void learn() {
        Student student = new Student(90l,"Joe");

        student.learn(40);
        Double expected = 40d;
        Assert.assertEquals(expected,student.getTotalStudyTime());
    }

    @Test
    public void getTotalStudyTime() {
    }
    @Test
    public void testImplementation() {
        Student student = new Student(90l,"Joe");
        Assert.assertTrue(student instanceof Learner);

    }
    @Test
    public void testInheritance() {

        Student student = new Student(90l,"Joe");
        Assert.assertTrue(student instanceof Person);
    }
}