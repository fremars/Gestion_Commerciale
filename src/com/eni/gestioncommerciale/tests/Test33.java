package com.eni.gestioncommerciale.tests;

import com.eni.gestioncommerciale.modele.Adresse;
import com.eni.gestioncommerciale.modele.Commande;
import com.eni.gestioncommerciale.modele.Personne;
import com.eni.gestioncommerciale.modele.Societe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test33 {

    public static void main(String[] args) {
        Personne employe1 = new Personne("M", "Remars", "Florent","6060606044", "florent@hotmail.fr");
        Personne employe2 = new Personne("M", "Remars", "Sylvere","6060606044", "sylvere@hotmail.fr");
//      Personne[] employes = {employe1, employe2};
        List<Personne> employes = new ArrayList<>();
        employes.add(employe1);
        employes.add(employe2);



        Commande commande1 = new Commande(0001, new Date(), null);
        Commande commande2 = new Commande(0002, new Date(), null);
        Commande commande3 = new Commande(0003, new Date(), null);
//      Commande[] commandes = {commande1, commande2, commande3};
        List<Commande> commandes = new ArrayList<>();
        commandes.add(commande1);
        commandes.add(commande2);
        commandes.add(commande3);



        Societe societe1 = new Societe(
                "SASIMMO",
                "Immobilier",
                 new Adresse("Rue de la source", "86490", "BEAUMONT", "RDC"),
                commandes,
                employes);

        commande1.setClient(societe1);
        commande2.setClient(societe1);
        commande3.setClient(societe1);

    }
}
