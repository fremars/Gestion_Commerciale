package com.eni.gestioncommerciale.tests;

import com.eni.gestioncommerciale.modele.Adresse;
import com.eni.gestioncommerciale.modele.Personne;
import com.eni.gestioncommerciale.modele.Produit;
import com.eni.gestioncommerciale.modele.Societe;

public class Test31 {
    public static void main(String[] args) {
        Personne test1 = new Personne("M", "REMARS", "Florent", "0606545411", "florent@hotmail.fr");
        Produit test2 = new Produit("Telephone", "Telephone portable", 150.66);
        Adresse adresse1 = new Adresse("rue de la source", "86490", "Beaumont", "666 ");
        Societe societe1 = new Societe("SocieteSAS", "Immobilier", adresse1);

        System.out.println(societe1.getActivite()+" "+societe1.getRaisonSociale()+" "+societe1.getAdresse().getRue());
        System.out.println(societe1.getAdresse().getCodePostal());
        System.out.println(societe1.getAdresse().getVille());
        System.out.println(societe1.getAdresse().getComplementAdresse());


    }
}