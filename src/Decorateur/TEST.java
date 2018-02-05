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
public class TEST {
    public static void main(String[] args) {   
    
    Contenu c =new Contenu("FIRST Content");
    ComposantVisuel cp=new BordureDouble(new BordureRidge(new BordureSolid(c)));
    cp.dessiner();
    
    }
}
