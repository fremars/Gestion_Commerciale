package com.eni.gestioncommerciale.modele;

import com.eni.gestioncommerciale.exception.GestionCommercialeException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Commande {
    private int numero;
    private Date date;
    private Societe client;
//  private LigneProduit[] lignesProduit = new LigneProduit[0];
    private List<LigneProduit> lignesProduit = new ArrayList<>();

    public Commande() {
    }

    public Commande(int numero, Date date, Societe client) {
        this.numero = numero;
        this.date = date;
        this.client = client;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Societe getClient() {
        return client;
    }

    public void setClient(Societe client) {
        this.client = client;
    }

//    public LigneProduit[] getLignesProduit() {
//        return lignesProduit;
//    }
//
//    public void setLignesProduit(LigneProduit[] lignesProduit) {
//        this.lignesProduit = lignesProduit;
//    }

    public void ajouterLigneProduit(LigneProduit ligneProduit) throws GestionCommercialeException {
        try {
//            int taille = lignesProduit.length;
//            LigneProduit[] nouveauLignesProduit=new LigneProduit[taille+1];
//            for(int i=0; i<taille; i++){
//                nouveauLignesProduit[i]=lignesProduit[i];
//            }
//            nouveauLignesProduit[taille]=ligneProduit;
//            lignesProduit=nouveauLignesProduit;
            lignesProduit.add(ligneProduit);
        } catch (Exception e)   {
            GestionCommercialeException exceptionLigneProduit = new GestionCommercialeException("Erreur lors de la manipulation des données de la commande.");
            throw exceptionLigneProduit;
        }

    }
}
