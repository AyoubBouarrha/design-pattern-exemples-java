/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabriqueAbestraque_Prototype;

/**
 *
 * @author Ayoub BOUARRHA
 */
public abstract class Automobile implements Cloneable{
    
    public Automobile duplique()
    {
        try 
        {
            return (Automobile) super.clone();
        }
        catch (CloneNotSupportedException ex) {
        }
        return null;
    }
    public abstract void demarrer();
}
