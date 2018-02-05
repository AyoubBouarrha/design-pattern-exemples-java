/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrique;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Ayoub BOUARRHA
 */
abstract class Client {
    private final Collection<Commande> listCommande = new ArrayList<>();
    abstract Commande creerCommande(double montant);

    void nouvelleCommande(double montant) {
        Commande c = creerCommande(montant);
        if (c.valide()) {
            c.payer();
            this.listCommande.add(c);
        }
    }

    public Collection<Commande> getListCommande() {
        return listCommande;
    }
}
