/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategie;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class EtudiantNote implements Comparable<EtudiantNote>{
    
    private String nom;
    private String prenom;
    private Float note;

    public EtudiantNote(String nom, String prenom, Float note) {
        this.nom = nom;
        this.prenom = prenom;
        this.note = note;
    }

    @Override
    public int compareTo(EtudiantNote o) {
       return note.compareTo(o.note);
    }
    
    
}
