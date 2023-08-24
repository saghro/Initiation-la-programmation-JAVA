
package serie4.distributeur;

public enum Valeur {
    LAS ("las",1),
    DOS ("dos",2),
    TRES("trs",3),
    QUATRO ("quatro",4),
    SINQU ("sinqu",5),
    SIS ("sis",6),
    SB3a ("sb3a",7),
    SUTA ("suta",10),
    KABAL ("kabal",11),
    RAY ("ray",12);

  
    private final String nom;
    private final int  valeur;
    private Valeur(String nom, int valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }
      public String getNom() {
        return nom;
    }

    public int getValeur() {
        return valeur;
    }
    
}
