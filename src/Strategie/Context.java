/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategie;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class Context {
    List<Etudiant> listEtudiants=new ArrayList<>();

    public Context(Tri t) {
        this.t = t;
    }
    
    
    Tri t;

    public void setT(Tri t) {
        this.t = t;
    }
}
