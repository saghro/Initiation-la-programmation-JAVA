
package serie4.dis;

public class Salarier {
    protected double salaire ;
    protected String nom ;

    public Salarier(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }
    public void afficherSalaire(){
        System.out.println("le salaire de " +this+ " est " +salaire);
    }
    
}
