/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;
import java.util.*;
/**
 *
 * @author Ayoub BOUARRHA
 */
public class Palette {
    private List<Forme> pal= new ArrayList<>();

    public Palette() {
        Scanner sc ;
        System.out.print("Ajouter Cercle (0/1) ? ");  
        if("1".equals(new Scanner(System.in).nextLine()))/*==>*/ajouter(new Cercle("Blanc"));
        System.out.print("Ajouter Triangle (0/1)? ");
        if("1".equals(new Scanner(System.in).nextLine()))/*==>*/ajouter(new Triangle("Blanc"));
        System.out.print("Ajouter Rectangle (0/1) ? ");
        if("1".equals(new Scanner(System.in).nextLine()))/*==>*/ajouter(new Rectangle("Blanc"));    
        
    }
    
    public void ajouter(Forme f)
    {
        pal.add(f);
    }
    
    public void afficher()
    {
        System.out.println("Palette");
        int i=0;
        for(Forme f : pal)
        {
            i++;            
            System.out.println(i+". "+f.toString());
        }
    }
    
    public Forme getForme(int rang)
    {
       return pal.get(rang-1).clone();
    }
    
    
}
