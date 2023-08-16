
package serie4.ex3;

public class Chef extends Employer {
    double prime;
    public Chef(String n, String p, double s , double prime) {
        super(n, p, s);
        this.prime = prime;
    }

    public double getSalaire() {
        return prime+salaire;
    }
    
}
