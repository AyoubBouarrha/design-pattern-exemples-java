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
abstract class Commande {
    protected double montant;

    abstract public void payer();

    abstract public boolean valide();

    @Override
    public String toString() {
        return "Commande{" + "montant=" + montant + '}';
    }
}
