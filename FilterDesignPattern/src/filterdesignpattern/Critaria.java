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
public interface Critaria {

    public List<Person> meetCriteria(List<Person> persons);
}
