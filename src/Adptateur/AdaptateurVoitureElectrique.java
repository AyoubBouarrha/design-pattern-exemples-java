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
public class AdaptateurVoitureElectrique extends Voiture{
    private VoitureElectrique ve=new VoitureElectrique();
    
    public void RemplissageDuBidan() {
        ve.ChargerBatterie();
    }
    
    
    public void Rouler(int vitesse) {
        ve.Circuler(vitesse);        
    }
}
