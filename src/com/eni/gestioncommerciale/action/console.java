package com.eni.gestioncommerciale.action;

import com.eni.gestioncommerciale.modele.Adresse;
import com.eni.gestioncommerciale.modele.Societe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class console {

    private  List<Societe> societes;
    private  Scanner sc;

    public console() {
        societes = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void ajouterClient() {
        Societe societe = new Societe();
        Adresse adresse = new Adresse();
        System.out.println("* --- AJOUT D'UN CLIENT --- *");
        System.out.println(" -> Raison sociale : ");
        societe.setRaisonSociale(sc.nextLine());
        System.out.println(" -> Activité : ");
        societe.setActivite(sc.nextLine());
        System.out.println(" -> Rue : ");
        adresse.setRue(sc.nextLine());
        System.out.println(" -> Code postal : ");
        adresse.setCodePostal(sc.nextLine());
        System.out.println(" -> Ville : ");
        adresse.setVille(sc.nextLine());
        System.out.println(" -> Complément d'adresse : ");
        adresse.setComplementAdresse(sc.nextLine());
        societe.setAdresse(adresse);
        try {
            societes.add(societe);
            System.out.println("* --- CLIENT AJOUTE --- *");
        } catch (Exception e) {
            System.err.println("Erreur lors de l'ajout du client.");
        }

    }

    public void listerClient() {

        System.out.println("* --- LISTE DES CLIENTS --- *");
        for (Societe s :
                societes) {
            //Adresse a = s.getAdresse();
            System.out.println(" -> Raison sociale : " + s.getRaisonSociale());
            System.out.println(" -> Activité : " + s.getActivite());
            System.out.println(" -> Rue : " + s.getAdresse().getRue());
            System.out.println(" -> Code postal : " + s.getAdresse().getCodePostal());
            System.out.println(" -> Ville : " + s.getAdresse().getVille());
            System.out.println(" -> Complément d'adresse : " + s.getAdresse().getComplementAdresse());
            System.out.println("------------------------------------------------");

        }


    }



}
