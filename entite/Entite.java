
package serie4.entite;

import java.util.ArrayList;

public abstract class Entite {
     public abstract void dessiner();
     
    public static void main(String[] args) {
        Joueur j1 = new Joueur();
        Enemie e1 = new Enemie();
        Arme a1 = new Arme();
        ArrayList <Entite> mesEntites = new ArrayList<>();
        mesEntites.add(j1);
        mesEntites.add(e1);
        mesEntites.add(a1);
        for (Entite e:mesEntites){
            e.dessiner();
        }
        
    }
}
