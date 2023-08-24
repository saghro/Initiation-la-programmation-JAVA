
package serie4.distributeur;

public class Carte {
    private Couleur couleur;
    private Valeur valeur;
    private boolean affiche;

    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
        
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public Valeur getValeur() {
        return valeur;
    }

    public boolean isAffiche() {
        return affiche;
    }
    public void tourner(){
        affiche = !affiche;
    }

    @Override
    public String toString() {
        String affichage;
        if(affiche)
            affichage = valeur.getNom()+ " dyal " + couleur.getNom();
        else
            affichage = "le catre est sur son dos je ne sais pas sa couleur et sa valeur";
        return affichage;
               
         }
    
}
