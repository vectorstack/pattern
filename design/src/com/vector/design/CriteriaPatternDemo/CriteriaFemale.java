package com.vector.design.CriteriaPatternDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DCITS-cs on 2018/2/5.
 */
public class CriteriaFemale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for(Person person: persons){
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
