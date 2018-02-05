package com.vector.design.CompositePatternDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DCITS-cs on 2018/2/5.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int sal){
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e){
        subordinates.add(e);
    }

    public List<Employee>  getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}
