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
public class TEST {
    public static void main(String[] args) {
        Voiture ve1 =new AdaptateurVoitureElectrique();
        ve1.RemplissageDuBidan();
        ve1.Rouler(200);
        
        Voiture ve2 =new AdaptateurVoitureElectrique();
        ve2.RemplissageDuBidan();
        ve2.Rouler(90);
    }
}
