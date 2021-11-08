/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetow;

public class Mammal implements Animal {
    int no_legs;
    String fav_food;

    @Override
    public void eat() { }

    @Override
    public void travel() {}

    public int getNoOfLegs() {
        return no_legs;
    }

    public String getFavOfFood() {
        return fav_food;
    }
    
    
    
    
}
