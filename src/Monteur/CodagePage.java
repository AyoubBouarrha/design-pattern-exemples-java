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
public abstract class CodagePage {
    protected HtmlPage page;
    
    public HtmlPage getHtmlPage(){
        return page;
    }
    
    public void creerNouvellePage(){
        this.page=new HtmlPage();
    }
    
    public abstract void ecrireTitre();
    public abstract void ecrireEnteteDePage();
    public abstract void ecrireBarreNavigation();
    public abstract void ecrireCorpsDePage();
    public abstract void ecrirePiedDePage();
}
