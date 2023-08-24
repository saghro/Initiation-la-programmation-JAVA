
package serie4.distributeur;

public class Distributeur {

    public static void main(String[] args) {
        Carte carte1 = new Carte(Couleur.KOBASS, Valeur.LAS);
        Carte carte2 = new Carte(Couleur.DHAB , Valeur.SUTA);
        Carte carte3 = new Carte(Couleur.DHAB, Valeur.SB3a);
        Carte carte4 = new Carte(Couleur.GRA3 , Valeur.SINQU);
        Carte carte5 = new Carte(Couleur.SYOUF, Valeur.QUATRO);
        carte1.tourner();
        carte2.tourner();
        carte3.tourner();
        carte4.tourner();
        carte5.tourner();
        Main joueur = new Main();
        Main ordinateur = new Main();
        Main milieu = new Main();
        joueur.ajouter(carte1);
        joueur.ajouter(carte2);
        joueur.ajouter(carte3);
        joueur.ajouter(carte4);
        joueur.ajouter(carte5);
        System.out.println(joueur.getMain());
        joueur.ajouterCarte(carte5, ordinateur);
        System.out.println(joueur.getMain());
        System.out.println(ordinateur.getMain());
        ordinateur.ajouterCarte(carte5, milieu);
        System.out.println(milieu.getMain());
        System.out.println(ordinateur.getMain());
        milieu.vider();
        System.out.println(joueur.contientCouleur(Couleur.KOBASS));
       
        
        
        
            }
}
