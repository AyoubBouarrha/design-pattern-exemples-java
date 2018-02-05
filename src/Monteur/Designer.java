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
public class Designer {
    private CodagePage constPage;
    
    public void SetCodagePage(CodagePage c){
        constPage=c;
    }
    
    public HtmlPage getHtmlPage(){
        return this.constPage.getHtmlPage();
    }
    
    public void CoderPageHTML()
    {
        this.constPage.creerNouvellePage();
        this.constPage.ecrireTitre();
        this.constPage.ecrireEnteteDePage();
        this.constPage.ecrireBarreNavigation();
        this.constPage.ecrireCorpsDePage();
        this.constPage.ecrirePiedDePage();
    }
}
