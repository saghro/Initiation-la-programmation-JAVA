

package serie4.poly;

import java.util.ArrayList;

public class Poly {

    public static void main(String[] args) {
       ArrayList <Animal> animaux = new ArrayList<>();
       animaux.add(new Chien());
       animaux.add(new Chien());
       animaux.add(new Chat());
       animaux.add(new Chat());
       animaux.add(new Animal());
       for(Animal a:animaux){
           a.marcher();
       }
    }
}
