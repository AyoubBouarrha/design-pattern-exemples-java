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
public class Facade {
    
    private static Facade currentFacade; 
    Ordinateur ordi;
    Smarthphone smarthP;
    SmarthTv smarthTv;

    private Facade() {
        this.ordi = new Ordinateur();
        this.smarthP = new Smarthphone();
        this.smarthTv = new SmarthTv();
    }
    
    public static synchronized Facade getInstance() {
         if (currentFacade == null) {
            currentFacade = new Facade();
        }
        return currentFacade;
    }
    
    //Odinateur #####################################################
    public void allumerOrdinateur()
    {
        ordi.allumer();
    }
    
    public void arreterOrdinateur()
    {
        ordi.arreter();
    }
    
    public void redemmarerOrdinateur()
    {
        ordi.redemarrer();
    }
    
    //Smart Phone #####################################################
    public void allumerSmarthPhone()
    {
        smarthP.allumer();
    }
    
    public void arreterSmarthPhone()
    {
        smarthP.arreter();
    }
    
    public void redemmarerSmarthPhone()
    {
        smarthP.redemarrer();
    }
    
    //Smart TV #####################################################
    public void allumerSmarthTv()
    {
        smarthTv.allumer();
    }
    
    public void arreterSmarthTv()
    {
        smarthTv.arreter();
    }
    
    public void redemmarerSmarthTv()
    {
        smarthTv.redemarrer();
    }
    
    
}
