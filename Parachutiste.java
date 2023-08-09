/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parachutiste;

import java.util.Scanner;

public class Parachutiste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constante et variables initiales
        final double g = 9.81;
        double v0 = 0;
        double t0 = 0;

        // Demander la masse et l'altitude de départ
        System.out.print("Entrez la masse du parachutiste (en kg) : ");
        double masse = scanner.nextDouble();
        System.out.print("Entrez l'altitude de départ (en m) : ");
        double h0 = scanner.nextDouble();

        // Initialisation des variables
        double vitesse = v0;
        double hauteur = h0;
        double accel = g;
        double t = t0;

        // Afficher les valeurs initiales
        System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);

        // Chute libre
        double s = 2.0 / masse;
        while (hauteur > 0) {
            t++;
            double q = Math.exp(-s * (t - t0));
            vitesse = g * s * (1 - q) + v0 * q;
            hauteur = h0 - g * s * (t - t0) - (v0 - g / s) * s * (1 - q);
            accel = g - s * vitesse;
            
            // Afficher les caractéristiques
            System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);
            
            // Vitesse du son et vitesse limite
            if (vitesse > 343) {
                System.out.println("## Felix depasse la vitesse du son");
            }
            if (accel < 0.5) {
                System.out.println("## Felix a atteint sa vitesse maximale");
            }
            
            // Ouverture du parachute
            if (hauteur < 2500) {
                s = 25.0 / masse;
                t0 = t;
                v0 = vitesse;
                h0 = hauteur;
                accel = 0;
                System.out.println("## Felix ouvre son parachute");
            }
        }

        scanner.close();
    }
}
