
package serie4.testform;


public class Carre extends Form{
    private int cote;

    public Carre(int cote) {
        this.cote = cote;
    }

    @Override
    public void calculerSurface() {
        System.out.println("la surface du carre est "+cote*cote);
    }
    
    
}
