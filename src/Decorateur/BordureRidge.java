/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorateur;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class BordureRidge extends Decorateur {
    int epeseur=2;
    String couleur="yellow";

    public BordureRidge(ComposantVisuel composant) {
        super(composant);
    }    
    
    @Override
    public void dessiner()
    {
        dessinerBordure();
        super.dessiner();        
    }
    
    public void dessinerBordure()
    {
        System.out.println("<div style=\"border:"+this.epeseur+"px ridge "+this.couleur+";\" />");
    }
}
