package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    KRISYOUNGER(129l, "Kris Younger"), RobertoDedeus(19l, "Roberto Dedeus"), ChrisNobles(11l, "Chris Nobles"), FroilanMiranda(10l, "Froilan Miranda"), LDolioDurant(10l, "L. Dolio Durant");

    private final Instructor instructor;
    private Double timeWorked;

    Educator(long id, String name) {
        this.instructor = new Instructor(id, name);
        Instructors.getInstance().add(this.instructor);
        this.timeWorked = 0d;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }
}
