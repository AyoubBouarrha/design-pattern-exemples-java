/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import java.util.Scanner;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class ProxyRequeteHttp implements RequeteHttp  {

    RequeteHttpReelle reqR;
    String login;
    String password;
    @Override    
    
    public void EnvoyerRequete(String req) {
        if(reqR==null)
        {
            while(true)
            {
                Scanner sc ;
                
                System.out.println("Entrer Login : ");
                login=new Scanner(System.in).nextLine();

                System.out.println("Entrer Password : ");
                password=new Scanner(System.in).nextLine();

                if("test".equals(login) && "123".equals(password))
                {
                    reqR=new RequeteHttpReelle();
                    reqR.EnvoyerRequete(req); 
                    break;
                }
                else
                    System.out.println("Mot de passe ou login incorrect");   
            }            
        }            
        else
        {
            reqR.EnvoyerRequete(req);
        }
            
    }

    public ProxyRequeteHttp() {
    }

    

    
}
