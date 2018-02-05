/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class Dessin {
     private List<Forme> monDessin= new ArrayList<>();
     
     public void ajouterForme(Forme f, String c)
     { 
        f.setCouleur(c);
        monDessin.add(f);
        f.dessiner();
     }
    
     public void affichage ()
     {
         if(monDessin.isEmpty())
         {
            System.out.println("Aucun dessin disponible");             
         }
         else
         {
            System.out.println("Votre dessin comprend");
            for(Forme f : monDessin)
                f.afficher();
         }
     }
}
