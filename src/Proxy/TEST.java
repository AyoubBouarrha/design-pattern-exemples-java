/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class TEST {
    public static void main(String[] args) {   
        ProxyRequeteHttp p =new ProxyRequeteHttp();
        p.EnvoyerRequete("http://www.localhost.com/");
    }
}
