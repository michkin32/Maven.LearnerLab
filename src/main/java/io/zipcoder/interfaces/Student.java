package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        for (int i = 0; i < numberOfHours ; i++) {
            totalStudyTime++;
        }

    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
