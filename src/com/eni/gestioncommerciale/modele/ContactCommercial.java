package com.eni.gestioncommerciale.modele;

public class ContactCommercial extends Personne {

    private String informationsComplementaires;

    public ContactCommercial() {
    }

    public ContactCommercial(String civilite, String nom, String prenom, String telephone, String email, String informationsComplementaires) {
        super(civilite, nom, prenom, telephone, email);
        this.informationsComplementaires = informationsComplementaires;
    }

    public String getInformationsComplementaires() {
        return informationsComplementaires;
    }

    public void setInformationsComplementaires(String informationsComplementaires) {
        this.informationsComplementaires = informationsComplementaires;
    }
}
