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
public class TEST {
    public static void main(String[] args) {        
     FabriqueMateriel UsineRouge = Producteur.getMateriel("Rouge");
     FabriqueMateriel UsineVert = Producteur.getMateriel("Vert");
     
     UsineRouge.creerOrdinateur().demarrer();
     UsineRouge.creerSmartPhone().demarrer();
     
     
     UsineVert.creerSmartPhone().demarrer();
     UsineVert.creerOrdinateur().demarrer();
    }
}
