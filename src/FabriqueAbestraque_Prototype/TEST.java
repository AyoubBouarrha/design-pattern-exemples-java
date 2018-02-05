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
public class TEST {
    public static void main(String[] args) {    
    FabriqueVehicule fb =new FabriqueVehicule();
    
    fb.setPrototypeAutomobile(new AutomobileElecticite());
    fb.setPrototypeScooter(new ScoterElecticite());
    fb.creerScooter().demarrer();
    fb.creerAutomobile().demarrer();
    fb.creerScooter().demarrer();
    fb.creerScooter().demarrer();
    fb.creerAutomobile().demarrer();
    fb.creerScooter().demarrer();
    fb.creerAutomobile().demarrer();
    fb.creerAutomobile().demarrer();
    
    fb.setPrototypeAutomobile(new AutomobileEssence());
    fb.setPrototypeScooter(new ScooterEssence());
    fb.creerScooter().demarrer();
    fb.creerAutomobile().demarrer();
    fb.creerScooter().demarrer();
    fb.creerScooter().demarrer();
    fb.creerAutomobile().demarrer();
    fb.creerScooter().demarrer();
    fb.creerAutomobile().demarrer();
    fb.creerAutomobile().demarrer();
    
    
    }
    
}
