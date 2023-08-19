
package serie4.ex4;

public class Ex4 {

    public static void main(String[] args) {
        Animal animal1 = new Animal("rex");
        animal1.manger();
        Chien chien1 = new Chien("tomi");
        chien1.marcher();
        chien1.manger();
        Oiseau oiseau1 = new Oiseau("tiwtiw");
        oiseau1.manger();
        oiseau1.voler();
    }
}
