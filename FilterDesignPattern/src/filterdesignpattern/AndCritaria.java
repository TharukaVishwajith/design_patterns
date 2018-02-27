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
public class AndCritaria implements Critaria {

    Critaria critaria1;
    Critaria critaria2;

    public AndCritaria(Critaria critaria1, Critaria critaria2) {
        this.critaria1 = critaria1;
        this.critaria2 = critaria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        return critaria2.meetCriteria(critaria1.meetCriteria(persons));
    }

}
