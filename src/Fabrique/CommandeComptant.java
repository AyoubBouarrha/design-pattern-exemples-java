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
public class CommandeComptant extends Commande {
    @Override
    public void payer() {
        System.out.println(this.montant + " est payé par comptant \n -----");
    }

    @Override
    public boolean valide() {
        return true;
    }

    public CommandeComptant(double montant) {
        this.montant = montant;
    }
}

