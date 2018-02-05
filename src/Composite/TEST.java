/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;



/**
 *
 * @author Ayoub BOUARRHA
 */
public class TEST {
        public static void main(String[] args) {
            
            Noeud racine =new Dossier("LPGLAASRI");
            Noeud d1 =new Dossier("Mes cours");
            Noeud d2 =new Dossier("Exams");
            
            Noeud f1 =new Fichier("PC.ppt",2000);
            Noeud f2 =new Fichier("Doc.doc",3000);
            Noeud f3 =new Fichier("Doc2.doc",4000);
            Noeud f4 =new Fichier("Doc3.docx",4000);
            Noeud f5 =new Fichier("Doc5.docx",4000);
            
            racine.ajouter(d1);
            racine.ajouter(d2);
            
            d1.ajouter(f1);
            d1.ajouter(f2);
            d1.ajouter(f3);
            d1.ajouter(f4);
            d1.ajouter(f5);
            
            System.out.println("Taille du "+racine+" est: "+racine.taille());
            racine.afficherParExtension("doc");
    }
}
