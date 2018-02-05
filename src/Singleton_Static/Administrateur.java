/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton_Static;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class Administrateur {
    
    private String nom;
    private int age;
    private static Administrateur currentAdmin = new Administrateur();

    private Administrateur() {
        this.nom = "";
        this.age = 0;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public static Administrateur getInstance() {
        return currentAdmin;
    }
   



    @Override
    public String toString() {
        return "Administrateur{" + "nom=" + nom + ", age=" + age + '}';
    }
    
    public static void main(String[] args) {
        Administrateur ad = Administrateur.getInstance();
        System.out.println(ad.toString());
        ad.setNom("BOUARRHA");
        ad.setAge(20);
        System.out.println(ad.toString());
        Administrateur ad2 = Administrateur.getInstance();
        System.out.println(ad2.toString());
    }
}
