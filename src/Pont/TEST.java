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
public class TEST {
    public static void main (String [] args)
    {
      Application con= new ApplicationDesktop(new BDMySQL());
      con.SeConnecter();
      con.SeDecnnecter();
      
      con.setBd(new BDSqlServer());
      con.SeConnecter();
      con.SeDecnnecter();
    }
}
