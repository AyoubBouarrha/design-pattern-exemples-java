/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observateur;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class VueReduction implements Observateur{
    
    private Reduction r;

    public VueReduction(Reduction r) {
        this.r=r;
        this.r.ajouter(this);
        afficher();
    }    

    @Override
    public void actualiser() {
       afficher();
    }
    
    public void afficher()
    {
        System.out.println("Reduction Ordinateurs : -"+ r.getReductionOrdinateurs()+"%\n"+
                            "Reduction Telephones : -"+ r.getReductionTelephone()+"%\n"+
                            "Reduction Vetements : -"+ r.getReductionVetement()+"%\n"+
                            "Reduction Voitures : -"+ r.getReductionVoiture()+"%\n");
    }
    
}
