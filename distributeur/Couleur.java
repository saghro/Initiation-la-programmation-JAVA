
package serie4.distributeur;

public enum Couleur {
    DHAB("dhab"),
    KOBASS("kobass"),
    SYOUF("syouf"),
    GRA3("Gra3");
    private final String nom;

    private Couleur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    
}
