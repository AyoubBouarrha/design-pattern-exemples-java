/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class Smarthphone implements Machine{

    @Override
    public void allumer() {
        
        System.out.println("Allumation Smart Phone...");
        try 
        {
            Thread.sleep(3500);
        } catch (InterruptedException ex) {}
        System.out.println("Smart Phone Allumer");
    }

    @Override
    public void arreter() {
        System.out.println("Arret Smart Phone...");
        try 
        {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {}
       System.out.println("Smart Phone Arreter"); 
    }

    @Override
    public void redemarrer() {
       arreter();
       allumer();
    }
    
}
