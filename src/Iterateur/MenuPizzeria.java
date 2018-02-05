/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterateur;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class MenuPizzeria extends Menu{
    private List<Plat> plates;

    public MenuPizzeria() {
        plates=new ArrayList<>();
        plates.add(new Plat("Salade", 30, true));
        plates.add(new Plat("Couscous", 50, false));
        plates.add(new Plat("Tagine Poulet", 60, true));
        plates.add(new Plat("Crep", 30, true));
    }
     

    @Override
    public IterateurMenu getIterateur() {
       return new IterrateurMenuList(plates);
    }
}
