/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton_GetInstance;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class Administrateur {
    
    private String nom;
    private int age;
    private static Administrateur currentAdmin;

    private Administrateur(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public static synchronized Administrateur getInstance(String nom, int age) {
        if (currentAdmin == null) {
            currentAdmin = new Administrateur(nom, age);
        }
        return currentAdmin;
    }

    @Override
    public String toString() {
        return "Administrateur{" + "nom=" + nom + ", age=" + age + '}';
    }
    
    public static void main(String[] args) {
        Administrateur ad = Administrateur.getInstance("Bouarrha", 20);
        Administrateur ad2 = Administrateur.getInstance("TEST", 21);
        System.out.println(ad.toString());
        System.out.println(ad2.toString());
    }
}
