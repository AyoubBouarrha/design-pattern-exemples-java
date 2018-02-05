/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrique;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class CommandeCredit extends Commande {
    
    public CommandeCredit(double montant) {
        this.montant = montant;
    }
    
    
     @Override
    public void payer() {
        System.out.println(this.montant + " est payé par credit  \n -----");
    }
  

    @Override
    public boolean valide() {
        if (this.montant >= 2000) {
            System.out.println("non valide \n -----");
            return false;
        }
        System.out.println("valide");
        return true;
    }
}
