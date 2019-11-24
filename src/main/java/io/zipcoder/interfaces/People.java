package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class People<E extends Person> implements Iterable<E>{
    List<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }
    public Person findById(long id){
        Person foundPerson = null;
        for (Person p : personList) {
            if (p.id == id){
                foundPerson = p;
            }
        }

        return foundPerson;

    }
    public Boolean contains(Person person){
        return personList.contains(person);
    }
    public void remove(Person person){
        personList.remove(person);
    }
    public void remove(long id){
        personList.remove(findById(id));
    }
    public void removeAll(){
        personList.clear();
    }
    public Integer count(){
        return personList.size();
    }
    public Person[] toArray(){
        Person[] people = new Person[personList.size()];
        for (int i = 0; i < people.length; i++){
            people[i] = personList.get(i);
        }
        return people;
    }

    @Override
    public Iterator iterator() {
        return (Iterator<E>)personList.iterator();
    }
}
