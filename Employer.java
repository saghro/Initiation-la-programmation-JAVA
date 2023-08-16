
package serie4.ex3;

public class Employer {
     String nom ,prenom;
      double salaire;
     
  public Employer(String n , String p , double s ){
       this.nom = n;
       this.prenom = p; 
       this.salaire = s;
  }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getSalaire() {
        return salaire;
    }
  
}
