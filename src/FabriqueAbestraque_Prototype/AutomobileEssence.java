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
public class AutomobileEssence extends Automobile{

    public void demarrer() {
        System.out.println("AutomobileEssence ["+System.identityHashCode(this)+"] démarré");
    }
}
