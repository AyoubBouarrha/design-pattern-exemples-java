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
public class CodagePageSport extends CodagePage{
      @Override
    public void ecrireTitre() {
        this.getHtmlPage().setTitre("Sprot News");
    }

    @Override
    public void ecrireEnteteDePage() {
       this.getHtmlPage().setEnteteDePage("<div id=\"EnteteDePage\" style=\"font-family: Arial Black, Gadget, sans-serif ;background-color: lightblue; font-size: 50px\"> \n" +
                                        "<div>\n" +
                                        "Sprot News PAGE\n" +
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
                                 "<p>"
                                + "Le sport est un ensemble d'exercices physiques se pratiquant sous forme de jeux individuels ou collectifs pouvant donner lieu à des compétitions. "
                                + "Le sport est un phénomène quasi universel dans le temps et dans l'espace humain."+
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
