package com.eni.gestioncommerciale.modele;

import java.util.ArrayList;
import java.util.List;

import com.eni.gestioncommerciale.exception.GestionCommercialeException;

public class Societe {
    private String raisonSociale;
    private String activite;
    private Adresse adresse;
    //  private Commande[] commandes=new Commande[0];
    private List<Commande> commandes = new ArrayList<Commande>();
    //  private Personne[] employes=new Personne[0];
    private List<Personne> employes = new ArrayList<Personne>();

    public Societe() {
    }

    public Societe(String raisonSociale, String activite, Adresse adresse) {
        this.raisonSociale = raisonSociale;
        this.activite = activite;
        this.adresse = adresse;
    }

    public Societe(String raisonSociale, String activite, Adresse adresse, List<Commande> commandes, List<Personne> employes) {
        this.raisonSociale = raisonSociale;
        this.activite = activite;
        this.adresse = adresse;
        this.commandes = commandes;
        this.employes = employes;
    }

//    public Societe(ArrayList<Commande> commandes) {
//        this.commandes = commandes;
//    }
//
//    public Societe(ArrayList<Personne> employes) {
//        this.employes = employes;
//    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    /*
        public Commande[] getCommandes() {
            return commandes;
        }

        public void setCommandes(Commande[] commandes) {
            this.commandes = commandes;
        }
    */

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public void ajouterCommande(Commande commande) throws GestionCommercialeException {
        try {
/*            int taille = commandes.length;
            Commande[] nouveauCommandes=new Commande[taille+1];
            for(int i=0; i<taille; i++){
                nouveauCommandes[i]=commandes[i];
            }
            nouveauCommandes[taille]=commande;
            commandes=nouveauCommandes;*/
            commandes.add(commande);
        } catch (Exception e) {
            throw new GestionCommercialeException("Erreur lors de l'ajout de la commande");
        }

    }

/*
    public Personne[] getEmployes() {
        return employes;
    }

    public void setEmployes(Personne[] employes) {
        this.employes = employes;
    }
*/

    public List<Personne> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Personne> employes) {
        this.employes = employes;
    }

    public void ajouterEmploye(Personne employe) throws GestionCommercialeException {
        try {
/*            int taille = employes.length;
            Personne[] nouveauEmployes=new Personne[taille+1];
            for(int i=0; i<taille; i++){
                nouveauEmployes[i]=employes[i];
            }
            nouveauEmployes[taille]=employe;
            employes=nouveauEmployes;*/
            employes.add(employe);
        } catch (Exception e) {
            throw new GestionCommercialeException("Erreur lors de l'ajout de l'employé.");
        }

    }
}
