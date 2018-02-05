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
public class Contenu extends ComposantVisuel{
    String text;

    @Override
    public void dessiner() {
        System.out.println(text);
    }

    public Contenu(String text) {
        this.text = text;
    } 
}
