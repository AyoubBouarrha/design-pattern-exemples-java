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
public class TEST {
    public static void main(String[] args) {        
        Client c = new ClientCredit();
        c.nouvelleCommande(1000);
        c.nouvelleCommande(5000);
        c.nouvelleCommande(1500);
        System.out.println(c.getListCommande().toString());
    }
}
