package com.eni.gestioncommerciale.tests;

import com.eni.gestioncommerciale.modele.ContactCommercial;
import com.eni.gestioncommerciale.modele.Dirigeant;
import com.eni.gestioncommerciale.modele.Personne;

public class Test41 {
    public static void main(String[] args) {

        Personne[] personnes = new Personne[3];
        Dirigeant dirigeant = new Dirigeant("M", "Remars", "Sylvere", "0660545411", "sylvere@hotmail.fr");
        ContactCommercial contact1 = new ContactCommercial("M", "Remars", "Sylvere", "0680343411", "sylvere@hotmail.fr", "Responsable commercial");
        ContactCommercial contact2 = new ContactCommercial("M", "Remars", "Yann", "0670232311", "yann@hotmail.fr","Responsable achat");

        personnes[0]=dirigeant;
        personnes[1]=contact1;
        personnes[2]=contact2;

        for (Personne pers: personnes
             ) {
            System.out.println("Nom : "+pers.getNom());
            System.out.println("Prénom : "+pers.getPrenom());
            System.out.println("Téléphone : "+pers.getTelephone());
            if (pers instanceof ContactCommercial  ){
                System.out.println("Infos compl. : "+((ContactCommercial) pers).getInformationsComplementaires());
            }
            System.out.println("***********");

            
        }






    }
}
