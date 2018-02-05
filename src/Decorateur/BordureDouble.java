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
public class BordureDouble extends Decorateur{

    int epeseur=4;
    String couleur="green";

    public BordureDouble(ComposantVisuel composant) 
    {
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
        System.out.println("<div style=\"border:"+this.epeseur+"px double "+this.couleur+";\" />");
    }
}
