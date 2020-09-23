package com.eni.gestioncommerciale.modele;

public class Dirigeant extends Personne{
    public Dirigeant() {
    }

    public Dirigeant(String civilite, String nom, String prenom, String telephone, String email) {
        super(civilite, nom, prenom, telephone, email);
    }
}
