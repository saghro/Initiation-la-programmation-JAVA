/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.champi;
import java.util.Scanner;

public class Champi {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		
		System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
		System.out.println("c�pe de Bordeaux, coprin chevelu ou agaric jaunissant.");

		System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");

		boolean anneau = clavier.nextBoolean();
		
		if (anneau == true){
			
			System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");

			boolean chapeau = clavier.nextBoolean();
			
			if (chapeau == true){
				
				System.out.print("Est-ce que votre champignon vit en for�t (true : oui, false : non) ? ");
				boolean foret = clavier.nextBoolean();
				
				if (foret == true){
					
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("l'amanite tue-mouches");

					
				} else {
					
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("l'agaric jaunissant");

					
				}
				
			} else {
			
				System.out.print("==> Le champignon auquel vous pensez est ");
				System.out.print("le coprin chevelu");
				
			}
			
			
			
		} else {
			
			System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
			boolean chapeau = clavier.nextBoolean();

			if (chapeau == true){
				System.out.print("==> Le champignon auquel vous pensez est ");
				System.out.print("le pied bleu");
				
			} else {
				
				System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
				boolean lamelle = clavier.nextBoolean();
				
				if (lamelle == true){
					
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("la girolle");

					
				} else {
					
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("le c�pe de Bordeaux");

					
				}

				
			}
			
		}
		
		
	}

}


