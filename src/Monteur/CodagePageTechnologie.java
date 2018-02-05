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
public class CodagePageTechnologie extends CodagePage{

    @Override
    public void ecrireTitre() {
        this.getHtmlPage().setTitre("New Technologie");
    }

    @Override
    public void ecrireEnteteDePage() {
       this.getHtmlPage().setEnteteDePage("<div id=\"EnteteDePage\" style=\"font-family: Arial Black, Gadget, sans-serif ;background-color: lightblue; font-size: 50px\"> \n" +
                                        "<div>\n" +
                                        "New Technologie PAGE\n" +
                                        "</div>\n" +
                                        "</div>");
    }

    @Override
    public void ecrireBarreNavigation() {
        this.getHtmlPage().setBarreNavigation("<div id=\"BarreNavigation\" style=\"font-family: Arial Black, Gadget, sans-serif ;background-color: lightgray\"> \n" +
                                 "<div>\n" 
                                +" <ul>\n" +
                                "   <li><a href=\"#\">Accueil</a></li>\n" +
                                "   <li><a href=\"#\">Articles</a></li>\n" +
                                "   <li><a href=\"#\">Contact</a></li>\n" +
                                "</ul>"+
                                "</div>\n" +
                                "</div>");
    }

    @Override
    public void ecrireCorpsDePage() {
        this.getHtmlPage().setCorpsDePage("<div id=\"CorpsDePage\" style=\"font-family: Arial Black, Gadget, sans-serif ;background-color: white; font-size: 20px\"> \n" +
                                 "<div>\n" +
                                 "<p>Les NTIC regroupent les innovations réalisées en matière de volume de st"
                                + "ockage et de rapidité du traitement de l'information ainsi que son transport grâce au"
                                + " numérique et aux nouveaux moyens de télécommunication (fibre optique, câble, satellites, "
                                + "techniques sans fil). Leur impact s'étend sur de multiples domaines, notamment sur notre mode de vie et notre économie. "
                                + "Les secteurs de production et d'utilisation de ces nouvelles techniques acquièrent une part croissante "
                                + "du PIB des économies développées et émergentes, d'où le concept de « nouvelle économie » ou « économie du savoir ». Cela ne fait pas disparaître l'économie traditionnelle, mais fait du savoir et de la connaissance, des éléments "+
                                "</p>"+
                                 "</div>\n" +
                                 "</div>");
    }

    @Override
    public void ecrirePiedDePage() {
              this.getHtmlPage().setPiedDePage("<div id=\"EnteteDePage\" style=\"font-family: Arial Black, Gadget, sans-serif ;background-color: lightblue; font-size: 15px\"> \n" +
                                        "<div>\n" +
                                        "Copyright © Ayoub\n" +
                                        "</div>\n" +
                                        "</div>");
    }
    
}
