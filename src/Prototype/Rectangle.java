/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class Rectangle extends Forme{

    public Rectangle(String couleur) {
        super(couleur);
    }

    @Override
    public void dessiner() {
        System.out.println("Dessin d'un rectangle avec la couleur "+ couleur);
    }

    @Override
    public void afficher() {
        System.out.println("Un "+this.toString()+" "+ couleur);
    }

        @Override
    public String toString() {
        return "Rectangle";
    }
}
