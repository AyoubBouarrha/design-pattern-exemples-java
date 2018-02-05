/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabriqueAbstraite;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class FabriqueMaterielRouge extends FabriqueMateriel{

    @Override
    Ordinateur creerOrdinateur() {
        return new OrdinateurRouge();
    }

    @Override
    SmartPhone creerSmartPhone() {
        return new SmathPhoneRouge();
    }
    
}
