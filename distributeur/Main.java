
package serie4.distributeur;
 
import java.util.ArrayList;

public class Main {
   private ArrayList <Carte> main = new ArrayList <>(); 

    public ArrayList<Carte> getMain() {
        return main;
    }
      public void  ajouter(Carte carte ){
          main.add(carte);
      }
      public void  ajouterCarte(Carte carte ,Main autreMain ){
          autreMain.ajouter(carte);
          main.remove(carte);
      }
      public  void vider(){
          main.clear();
      }
      public int getNumberCart (){
          return main.size();
      }
      public boolean contientCouleur (Couleur couleur ){
          boolean contient  = false ;
          for(Carte c:main){
              if(c.getCouleur().getNom().equals(couleur.getNom())){
                   contient = true;
              }
              else {
                  contient=false;
              }
           
          }
        return contient;
        
      }
             
}
