/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pont;

/**
 *
 * @author Ayoub BOUARRHA
 */
public abstract class Application {
    public abstract void SeConnecter();
    public abstract void SeDecnnecter();
    protected BaseDeDonnee bd;
    
    public void setBd(BaseDeDonnee bd) {
        this.bd = bd;
    }
}
