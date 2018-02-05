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
public class VoitureElectrique {

 
    public void ChargerBatterie() {
       System.out.println("Chargement du battrie");
    }


    public void Circuler(int vitesse) {
        if(vitesse<=100)
        {
             System.out.println("Voiture circule avec une vitesse de :"+vitesse);
        }
        else
        {
            System.out.println("impossible de circuler avec cette vitesse");
        }
    }
    
}
