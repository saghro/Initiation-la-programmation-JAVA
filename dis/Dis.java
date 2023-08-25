
package serie4.dis;

import java.util.ArrayList;

public class Dis {

    public static void main(String[] args) {
       Chef chef = new Chef("hamid");
       Directeur dir = new Directeur("yuba");
       Ouvrier ouv = new Ouvrier("khalid");
        ArrayList <Salarier> salarier = new ArrayList <>();
        salarier.add(ouv);
        salarier.add(dir);
        salarier.add(chef);
        for(Salarier salari:salarier){
            salari.afficherSalaire();
        }
               
    }
}
