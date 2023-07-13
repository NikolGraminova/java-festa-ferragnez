package com.ferragnez.party;

/*
Nel programma bisogna:
creare e inizializzare l’array contenente i nomi degli invitati
chiedere all’utente come si chiama
verificare che il nome sia presente nella lista lasciarlo entrare o rispedirlo cortesemente da dove è venuto
Bonus: se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa
 */

import java.util.Arrays;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String[] guests = {"Dua Lipa","Paris Hilton","Manuel Agnelli","Francesco Totti", "Ilary Blasi","Bebe Vio","Luis","Paradis Zarei","Martina Maccherone","Rachel Zeilic"};

        boolean check = false;

        while (!check){
            System.out.println("Enter your name: ");
            String user = scan.nextLine();
            if (Arrays.asList(guests).contains(user)) {
                System.out.println("You can get in.");
                check = true;
            } else {
                System.out.println("Get out.");
            }
        }

        scan.close();
    }
}
