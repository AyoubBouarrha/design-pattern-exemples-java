/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adptateur;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class VoitureEsssence extends Voiture{

    @Override
    public void RemplissageDuBidan() {
        System.out.println("Remplissage du Bidan d'essence ");
    }

    @Override
    public void Rouler(int vitesse) {
        if(vitesse<=200)
        {
             System.out.println("Voiture roule avec une vitesse de :"+vitesse);
        }
        else
        {
            System.out.println("impossible de rouler avec cette vitesse");
        }
    }
    
}
