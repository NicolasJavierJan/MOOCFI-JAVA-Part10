/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    private ArrayList<Person> employees;
    
    public Employees(){
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        for (Person person : peopleToAdd){
            this.employees.add(person);
        }
    }
    
    public void print(){
        Iterator<Person> iterator = this.employees.iterator();
        
        while (iterator.hasNext()){
            Person nextPerson = iterator.next();
            System.out.println(nextPerson.toString());
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = this.employees.iterator();
        
        while (iterator.hasNext()){
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == education){
                System.out.println(nextPerson.toString());
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.employees.iterator();
        
        while (iterator.hasNext()){
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == education){
                iterator.remove();
            }
        }
    }
}
