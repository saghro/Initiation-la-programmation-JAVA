

package serie4.testinterface;

import java.util.ArrayList;

public class TestInterface {

    public static void main(String[] args) {
       Chien chien = new Chien();
       Serpent srpent = new Serpent();
       Loin loin = new Loin();
        ArrayList<Animal> animaux = new ArrayList<>();
        animaux.add(loin);
        animaux.add(chien);
        animaux.add(srpent);
        for (Animal a:animaux ){
            a.bouger();
            a.crier();
            a.manger();
        }
               
    }
}
