/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.Scanner;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class Editeur {
    private Palette pal;
    private Dessin dessin;

    public Editeur(Palette pal) {
        this.pal = pal;
        dessin=new Dessin();
    }
    
    public void afficherDessin()
    {
        dessin.affichage();
    }

    public void setPal(Palette pal) {
        this.pal = pal;
    }
    
    public void dessiner()
    {
     pal.afficher();
     System.out.print("Choisir une forme à dessiner: ");
     int i=new Scanner(System.in).nextInt();
     Forme f = pal.getForme(i);
     System.out.print("Couleur ? ");
     String c = new Scanner(System.in).nextLine();
     dessin.ajouterForme(f, c);
    }
    
}
