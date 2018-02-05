/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabriqueAbestraque_Prototype;

/**
 *
 * @author Ayoub BOUARRHA
 */
public  class FabriqueVehicule {
    private Scooter prototypeScooter;
    private Automobile prototypeAutomobile;
    
    public Automobile creerAutomobile(){
        return prototypeAutomobile.duplique();
    }
    public Scooter creerScooter(){
        return prototypeScooter.duplique();
    }

    public Scooter getPrototypeScooter() {
        return prototypeScooter;
    }

    public void setPrototypeScooter(Scooter prototypeScooter) {
        this.prototypeScooter = prototypeScooter;
    }

    public Automobile getPrototypeAutomobile() {
        return prototypeAutomobile;
    }

    public void setPrototypeAutomobile(Automobile prototypeAutomobile) {
        this.prototypeAutomobile = prototypeAutomobile;
    }
    
    
}
