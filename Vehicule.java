package serie4.mainn;

public class Vehicule {
       private String model,marque ,annne;
     private int vitesse ;
     
 public Vehicule(String m , String ma , String a ){
      this.model = m;
      this.annne=a;
      this.marque=ma;
      vitesse=0;
 }

    public String getModel() {
        return model;
    }

    public String getMarque() {
        return marque;
    }

    public String getAnnne() {
        return annne;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setAnnne(String annne) {
        this.annne = annne;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    @Override
    public String toString() {
        return "Voiture{" + "model=" + model + ", marque=" + marque + ", annne=" + annne + '}';
    }
   public void accelerer(){
      if(vitesse<200)
       vitesse +=5;
      else
           System.out.println("vous avez attient la viteesse max ");  
   }
   public void ralentir(){
      if(vitesse>0)
       vitesse -=5;
      else
           System.out.println(" la voiture est arreter");  
   }
   public boolean estarreter(){
    if(vitesse == 0)
      return true;
    else 
        return false;
   }
}


