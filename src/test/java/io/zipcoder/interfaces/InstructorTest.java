package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(90l,"Joe");
        Assert.assertTrue(instructor instanceof Learner);

    }
    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(90l,"Joe");
        Assert.assertTrue(instructor instanceof Person);

    }

    @Test
    public void lectureTest() {
        Instructor instructor = new Instructor(90l,"Joe");
        Student[] students = new Student[4];
        for (int i = 0; i < 4; i++){
            students[i] = new Student(90l,"Bob");
        }
        instructor.lecture(students, 40);
        for (int i = 0; i < 4; i++){
            Assert.assertTrue(students[i].totalStudyTime == 10);
        }
    }

    @Test
    public void teachTest() {
        Instructor instructor = new Instructor(90l,"Joe");
        Student student = new Student(912l,"lou");
        instructor.teach(student, 40);
        assertTrue(student.totalStudyTime == 40l);
    }
}