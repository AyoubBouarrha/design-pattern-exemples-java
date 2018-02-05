/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabriqueAbstraite;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class Producteur {
    public static FabriqueMateriel getMateriel(String str)
    {
        switch (str.toLowerCase())
        {
            case "rouge" : return new FabriqueMaterielRouge();
            case "vert" : return new FabriqueMaterielVert();
            default : return null;
        }
    }
}
