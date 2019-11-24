package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {
    private final static Instructors INSTANCE = new Instructors();

    private Instructors(){
        super.add(new Instructor(129l, "Kris Younger"));
        super.add(new Instructor(19l, "Roberto Dedeus"));
        super.add(new Instructor(11l, "Chris Nobles"));
        super.add(new Instructor(10l, "Froilan Miranda"));
        super.add(new Instructor(10l, "L. Dolio Durant"));


    }

    @Override
    public Instructor[] toArray() {
        Instructor[] newArray = new Instructor[this.getPersonList().size()];

        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = this.getPersonList().get(i);

        }
        return newArray;
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}

