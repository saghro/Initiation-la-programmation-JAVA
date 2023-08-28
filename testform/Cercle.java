
package serie4.testform;


public class Cercle extends Form {
    private int rayon;

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public void calculerSurface() {
        System.out.println("la surface de cercle est " +Math.PI*rayon*rayon);
    }
}
