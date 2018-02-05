/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monteur;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class Test {
    public static void main (String [] args)
    {
        Designer ds=new Designer();
        
        //Test Page Technologie
        ds.SetCodagePage(new CodagePageTechnologie());
        ds.CoderPageHTML();
        ds.getHtmlPage().GenererPageHtml();
        
        System.out.println("##########################################################################################################################################################################################################################################################################");
        
        //Test Page Sport
        ds.SetCodagePage(new CodagePageSport());
        ds.CoderPageHTML();
        ds.getHtmlPage().GenererPageHtml();
    }    
}
