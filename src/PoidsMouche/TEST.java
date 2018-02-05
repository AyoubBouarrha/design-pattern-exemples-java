/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoidsMouche;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class TEST {
    public static void main (String [] args)
    {
        FabriqueOption fb = FabriqueOption.getInstance();
        
        Vehicule[] mesVehicules =new Vehicule[10000];
        for(int i=0;i<10000;i++)
            mesVehicules[i]=new Vehicule("v"+i, "t"+i);
        
        for(int i=0;i<10000;i++)
        {
            mesVehicules[i].ajouterOption("Clim", 4000);
            mesVehicules[i].ajouterOption("AirBug", 4000);
        }
        
         for(int i=0;i<10000;i++)
             mesVehicules[i].affichage();
    }
}
