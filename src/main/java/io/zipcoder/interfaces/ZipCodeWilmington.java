package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture( students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor =  instructors.findById(id);
        instructor.lecture(students.toArray(), numberOfHours);
    }

    public Map getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<>();

        for (int i = 0; i < students.count(); i++) {
            Student temp = students.findById(i);
            studyMap.put(temp, temp.getTotalStudyTime());
        }
        return studyMap;
    }
}
