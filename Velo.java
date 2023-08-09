/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.velo;

import java.util.Scanner;

public class Velo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur l'heure de début de la location
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int heureDebut = scanner.nextInt();

        // Demander à l'utilisateur l'heure de fin de la location
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int heureFin = scanner.nextInt();

        // Vérification des heures
        if (heureDebut < 0 || heureDebut > 24 || heureFin < 0 || heureFin > 24) {
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");
            return;
        }
        if (heureDebut == heureFin) {
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
            return;
        }
        if (heureDebut > heureFin) {
            System.out.println("Bizarre, le début de la location est après la fin ...");
            return;
        }

        // Calcul du coût de la location
        double montantTotal = 0;
        System.out.println("Vous avez loué votre vélo pendant");
        for (int heure = heureDebut; heure < heureFin; heure++) {
            double tarifHoraire = (heure >= 7 && heure < 17) ? 2.0 : 1.0;
            montantTotal += tarifHoraire;
            System.out.println(heure - heureDebut + 1 + " heure(s) au tarif horaire de " + tarifHoraire + " franc(s)");
        }

        System.out.println("Le montant total à payer est de " + montantTotal + " franc(s).");

        scanner.close();
    }
}
