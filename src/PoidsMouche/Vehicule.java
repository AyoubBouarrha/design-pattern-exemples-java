/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoidsMouche;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class Vehicule {
  
   private String marque;
   private String type;
   private List<Float> prixOptions; 
   private List<OptionVehicule> listOptions;


   

    public Vehicule(String marque, String type) {
        this.marque = marque;
        this.type = type;
        prixOptions=new ArrayList<>();
        listOptions=new ArrayList<>();
    }
   
   
   
   public void ajouterOption (String nom,float prix){       
       
       listOptions.add(FabriqueOption.getOption(nom));
       prixOptions.add(prix);  
               
   }
   
   public void affichage()
   {       
       System.out.println(this.toString()); 
   }

    @Override
    public String toString() {
        return "Vehicule{" + "marque=" + marque + ", type=" + type + ", prixOptions=" + prixOptions + ", listOptions=" + showOptions() ;
    }
    
    public String showOptions()
    {
        String s="";
        for (OptionVehicule op : listOptions)
            s+="\n \t -Option :"+ op.toString()+" Hash ="+System.identityHashCode(op);
        return s;
    }
   
}
