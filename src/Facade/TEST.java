/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class TEST {
    public static void main (String [] args)
    {
        Facade fac=Facade.getInstance();
        fac.allumerOrdinateur();
        fac.arreterOrdinateur();
        
        
        fac.allumerSmarthPhone();
        fac.redemmarerSmarthPhone();
        
        fac.allumerSmarthTv();
                
    }
}
