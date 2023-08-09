/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suite;

import java.util.Scanner;

public class Suite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander les bornes
        System.out.print("Entrez la borne inférieure : ");
        int borneInf = scanner.nextInt();
        System.out.print("Entrez la borne supérieure : ");
        int borneSup = scanner.nextInt();

        // Afficher le nombre de répétitions pour chaque nombre entre les bornes
        for (int nombre = borneInf; nombre <= borneSup; nombre++) {
            int repetitions = calculRepetitions(nombre);
            System.out.println(nombre + " -> " + repetitions);
        }

        scanner.close();
    }

    // Fonction pour calculer le nombre de répétitions nécessaires pour arriver à 0
    public static int calculRepetitions(int nombre) {
        int repetitions = 0;
        while (nombre != 0) {
            if (nombre % 3 == 0) {
                nombre += 4;
            } else if (nombre % 4 == 0) {
                nombre /= 2;
            } else {
                nombre -= 1;
            }
            repetitions++;
        }
        return repetitions;
    }
}
