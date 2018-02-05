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
public class SmarthTv implements Machine{

    @Override
    public void allumer() {
        System.out.println("Allumation Smart TV...");
        try 
        {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {}
        System.out.println("Smart TV Allumer");
    }

    @Override
    public void arreter() {
        System.out.println("Arret Smart TV...");
        try 
        {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {}
       System.out.println("Smart TV Arreter"); 
    }

    @Override
    public void redemarrer() {
       arreter();
       allumer();
    }
    
}
