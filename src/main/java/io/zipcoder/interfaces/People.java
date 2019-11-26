package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{


    private List<E> personList;

    public People(){
        this.personList = new ArrayList<E>();
    }

    public void add(E person){
        personList.add(person);
    }
    public E findById(long id){
        Person foundPerson = null;
        for (Person p : personList) {
            if (p.id == id){
                foundPerson = p;
            }
        }

        return (E)foundPerson;

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

    public abstract E[] toArray();

   public List<E> getPersonList() {
       return personList;
   }

    @Override
    public Iterator iterator() {
        return personList.iterator();
    }
}
