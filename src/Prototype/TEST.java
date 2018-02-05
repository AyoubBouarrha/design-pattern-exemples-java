/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import Fabrique.*;
import java.util.*;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class TEST {
    public static void main(String[] args) {   
       
            Palette p=new Palette();
            Editeur ed= new Editeur(p);
            
        while(true)
        {
            ed.dessiner();            
            
            System.out.print("Voulez vous ajouter une autre forme (0/1) ? ");            
            if(new Scanner(System.in).nextInt()==0)
            {
                ed.afficherDessin();
                break;
            }
            
        }
           
    }
}
