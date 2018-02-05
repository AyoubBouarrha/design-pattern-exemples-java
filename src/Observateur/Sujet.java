/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observateur;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ayoub BOUARRHA
 */
public abstract class Sujet {
    List<Observateur> listObs =new ArrayList<>(); 
    

    
    public void ajouter(Observateur o) {
        listObs.add(o);
    }

    
    public void supprimer(Observateur o) {
        listObs.remove(o);
    }
    
    
    public void notifier() {
        for(Observateur ob : listObs)
            ob.actualiser();
    }
}
