package com.eni.gestioncommerciale.modele;

public class LigneProduit {
    private int quantite;
    private Produit produit;

    public LigneProduit() {
    }

    public LigneProduit(int quantite, Produit produit) {
        this.quantite = quantite;
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getMontantLigne() {
        return quantite*produit.getPrix();
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
