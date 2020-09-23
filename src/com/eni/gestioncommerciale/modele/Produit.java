package com.eni.gestioncommerciale.modele;

public class Produit {
    private String reference;
    private String description;
    private double prix;

    public Produit() {
    }

    public Produit(String reference, String description, double prix) {
        this.reference = reference;
        this.description = description;
        this.prix = prix;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}

