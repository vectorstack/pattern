package com.vector.design.CriteriaPatternDemo;

import java.util.List;

/**
 * Created by DCITS-cs on 2018/2/2.
 */
public interface Criteria {
    public List<Person> meetCirteria(List<Person> persons);
}
