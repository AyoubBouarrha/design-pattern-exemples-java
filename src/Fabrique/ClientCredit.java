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
public class ClientCredit  extends Client{
    @Override
    Commande creerCommande(double montant) {
        return new CommandeCredit(montant);
    }
}
