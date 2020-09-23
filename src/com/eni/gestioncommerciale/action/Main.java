package com.eni.gestioncommerciale.action;

public class Main {
    public static void main(String[] args) {
        final String version="1.0";
        System.out.println("****************************************");
        System.out.println("*** Gestion Commerciale d’entreprise ***");
        System.out.println("*** Version : "+version+"                    ***");
        System.out.println("***                                  ***");
        System.out.println("*** Bienvenue !                      ***");
        System.out.println("****************************************");

        console consoleClient = new console();
        consoleClient.ajouterClient();
        consoleClient.ajouterClient();
        consoleClient.listerClient();

        System.out.println("****************************************");
        System.out.println("*** Programme terminé. Au revoir !   ***");
        System.out.println("****************************************");


    }
}
