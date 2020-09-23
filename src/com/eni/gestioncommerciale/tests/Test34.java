package com.eni.gestioncommerciale.tests;

import com.eni.gestioncommerciale.exception.GestionCommercialeException;
import com.eni.gestioncommerciale.modele.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test34 {

    public static void main(String[] args) {
        Personne employe1 = new Personne("M", "Remars", "Florent", "6060606044", "florent@hotmail.fr");
        Personne employe2 = new Personne("M", "Remars", "Sylvere", "6060606044", "sylvere@hotmail.fr");
        List<Personne> employes = new ArrayList<>();
        employes.add(employe1);
        employes.add(employe2);

        Produit produit1 = new Produit("1234","Telephone Portable", 123.45);
        Produit produit2 = new Produit("5678","Tablette", 567.89);
        Produit produit3 = new Produit("8989","Ordinateur", 1111.22);

        LigneProduit ligneProduit1 = new LigneProduit(1,produit1);
        LigneProduit ligneProduit2 = new LigneProduit(2,produit2);
        LigneProduit ligneProduit3 = new LigneProduit(3,produit3);


        Commande commande1 = new Commande(0001, new Date(), null);
        Commande commande2 = new Commande(0002, new Date(), null);
        Commande commande3 = new Commande(0003, new Date(), null);
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

        try {
            commande1.ajouterLigneProduit(ligneProduit1);
        } catch (GestionCommercialeException e) {
            System.err.println("Erreur : "+e.getMessage());;
        }
        try {
            commande1.ajouterLigneProduit(ligneProduit3);
        } catch (GestionCommercialeException e) {
            System.err.println("Erreur : "+e.getMessage());;
        }
        try {
            commande2.ajouterLigneProduit(ligneProduit2);
        } catch (GestionCommercialeException e) {
            System.err.println("Erreur : "+e.getMessage());;
        }

    }
}
