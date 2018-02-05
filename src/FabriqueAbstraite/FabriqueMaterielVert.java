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
public class FabriqueMaterielVert extends FabriqueMateriel{

    @Override
    Ordinateur creerOrdinateur() {
        return new OrdinateurVert();
    }

    @Override
    SmartPhone creerSmartPhone() {
        return new SmathPhoneVert();
    }
    
}
