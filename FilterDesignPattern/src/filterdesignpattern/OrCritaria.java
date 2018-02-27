/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filterdesignpattern;

import java.util.List;

/**
 *
 * @author Asus PC
 */
public class OrCritaria implements Critaria {

    Critaria critaria1;
    Critaria critaria2;

    public OrCritaria(Critaria critaria1, Critaria critaria2) {
        this.critaria1 = critaria1;
        this.critaria2 = critaria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = critaria1.meetCriteria(persons);
        List<Person> otherCriteriaItems = critaria2.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;

       // return critaria2.meetCriteria(critaria1.meetCriteria(persons));
    }

}
