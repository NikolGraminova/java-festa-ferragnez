package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuestBonus {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String[] guests = {"Dua Lipa","Paris Hilton","Manuel Agnelli","Francesco Totti", "Ilary Blasi","Bebe Vio","Luis","Paradis Zarei","Martina Maccherone","Rachel Zeilic"};
        System.out.println("Enter your name: ");
        String user = scan.nextLine();

        boolean check = false;

        for (int i = 0; i < guests.length; i++)
            if (user.equals(guests[i])) {
                check = true;
                break;
            }

        if (check){
            System.out.println("You can get in.");
        } else {
            System.out.println("Get out.");
        }
        scan.close();
    }
}
