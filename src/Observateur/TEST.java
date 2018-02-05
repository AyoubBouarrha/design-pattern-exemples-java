/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observateur;

import java.util.ArrayList;
import javafx.print.Collation;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class TEST {
    public static void main (String [] args)
    {
        Reduction sj=new Reduction(18,20,60,20);
        Observateur o1 =new VueReduction(sj);
        Observateur o2 =new VueReduction(sj);
        sj.setReductionTelephone(10);
        
        
        
    }
}
