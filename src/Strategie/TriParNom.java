/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class TriParNom implements Tri{ 

    @Override
    public void afficher(ArrayList<Etudiant> list) {
        Collections.sort(list);
        System.out.println(list);
    }
    
}
