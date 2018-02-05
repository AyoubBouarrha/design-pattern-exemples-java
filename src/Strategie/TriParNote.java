/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategie;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class TriParNote implements Tri{

    @Override
    public void afficher(ArrayList<Etudiant> list) {
        ArrayList<EtudiantNote> listNote =new ArrayList<>();
        for(Etudiant e: list)
            listNote.add(new EtudiantNote(e.getNom(), e.getPrenom(), e.getNote()));        
        
        Collections.sort(listNote);
        System.out.println(list);
    }
    
    
}
