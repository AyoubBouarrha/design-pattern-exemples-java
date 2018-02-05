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
public class HtmlPage {
    private String titre;
    private String enteteDePage;
    private String barreNavigation;
    private String corpsDePage;
    private String piedDePage;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }    
    public String getEnteteDePage() {
        return enteteDePage;
    }

    public void setEnteteDePage(String enteteDePage) {
        this.enteteDePage = enteteDePage;
    }

    public String getBarreNavigation() {
        return barreNavigation;
    }

    public void setBarreNavigation(String barreNavigation) {
        this.barreNavigation = barreNavigation;
    }

    public String getCorpsDePage() {
        return corpsDePage;
    }

    public void setCorpsDePage(String corpsDePage) {
        this.corpsDePage = corpsDePage;
    }

    public String getPiedDePage() {
        return piedDePage;
    }

    public void setPiedDePage(String piedDePage) {
        this.piedDePage = piedDePage;
    }
    
    public void GenererPageHtml()
    {
        System.out.println("<!DOCTYPE html>\n"
                        +"<html>\n"+
                        "<head>\n" +
                        "<title>"+this.titre+"</title>\n" +
                        "<meta charset=\"UTF-8\">"+""
                        +"\n</head>"
                        +"\n<body> \n"
                        +this.enteteDePage+""
                        +this.barreNavigation+""
                        +this.corpsDePage+""
                        +this.piedDePage
                        +"\n</body> \n"
                        +"</html>");
    }
}
