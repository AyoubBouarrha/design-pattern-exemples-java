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
public class Reduction extends Sujet{
    
    private float reductionOrdinateurs;
    private float reductionTelephone;
    private float reductionVoiture;
    private float reductionVetement;

    public float getReductionOrdinateurs() {
        return reductionOrdinateurs;
    }

    public void setReductionOrdinateurs(float reductionOrdinateurs) {
        this.reductionOrdinateurs = reductionOrdinateurs;
        this.notifier();
    }

    public float getReductionTelephone() {
        return reductionTelephone;
    }

    public void setReductionTelephone(float reductionTelephone) {
        this.reductionTelephone = reductionTelephone;
        this.notifier();
    }

    public float getReductionVoiture() {
        return reductionVoiture;
    }

    public void setReductionVoiture(float reductionVoiture) {
        this.reductionVoiture = reductionVoiture;
        this.notifier();
    }

    public float getReductionVetement() {
        return reductionVetement;
    }

    public void setReductionVetement(float reductionVetement) {
        this.reductionVetement = reductionVetement;
        this.notifier();
    }

    public Reduction(float reductionOrdinateurs, float reductionTelephone, float reductionVoiture, float reductionVetement) {
        this.reductionOrdinateurs = reductionOrdinateurs;
        this.reductionTelephone = reductionTelephone;
        this.reductionVoiture = reductionVoiture;
        this.reductionVetement = reductionVetement;
    }
    
    
    
    public Reduction() {
    }
    
    

    
}
