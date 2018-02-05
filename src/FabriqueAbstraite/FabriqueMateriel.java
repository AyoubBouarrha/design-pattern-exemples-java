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
public abstract class FabriqueMateriel {
    abstract Ordinateur creerOrdinateur();
    abstract SmartPhone creerSmartPhone();
}
