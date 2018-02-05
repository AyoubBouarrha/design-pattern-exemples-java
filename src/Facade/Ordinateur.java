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
public class Ordinateur implements Machine{
   
    @Override
    public void allumer() {
        System.out.println("Allumation Ordinateur...");
        try 
        {
            Thread.sleep(8000);
        } catch (InterruptedException ex) {}
        System.out.println("Ordinateur Allumer");
    }

    @Override
    public void arreter() {
        System.out.println("Arret Ordinateur...");
        try 
        {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {}
       System.out.println("Ordinateur Arreter"); 
    }

    @Override
    public void redemarrer() {
       arreter();
       allumer();
    }
}
