package com.vector.design.CriteriaPatternDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DCITS-cs on 2018/2/2.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for(Person person: persons){
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
