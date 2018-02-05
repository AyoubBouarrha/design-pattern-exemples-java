/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoidsMouche;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class FabriqueOption {
    private static Map<String,OptionVehicule>  list ;
    
    private static FabriqueOption currentFabriqueOption; 
    
    public static synchronized FabriqueOption getInstance() {
         if (currentFabriqueOption == null) {
            currentFabriqueOption = new FabriqueOption();
        }
        return currentFabriqueOption;
    }
    
    private FabriqueOption()
    {
        list=new HashMap<>();
    }
    
    public static OptionVehicule getOption(String nom)
    {
        if(list.containsKey(nom))
            return list.get(nom);
        else
        {
           list.put(nom,new OptionVehicule(nom, nom+"Des"));
           return list.get(nom);
        }
    }
}
