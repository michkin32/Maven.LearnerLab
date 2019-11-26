package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class Students extends People<Student> {
    private final static Students INSTANCE = new Students();

    private Students(){
        super.add(new Student(129l, "Wesley Jones"));
        super.add(new Student(19l, "Aashna Bajwa"));
        super.add(new Student(11l, "Angel Mendoza"));
        super.add(new Student(10l, "Chungsing Arguello"));
        super.add(new Student(14l, "Ryan Miller"));
        super.add(new Student(21l, "Michael Gray"));
        super.add(new Student(41l, "Val Fragier"));
        super.add(new Student(51l, "Josh Gates"));


    }

    @Override
    public Student[] toArray() {
        Student[] newArray = new Student[this.getPersonList().size()];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = this.getPersonList().get(i);

        }
        return newArray;
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
