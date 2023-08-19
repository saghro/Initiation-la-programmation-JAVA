
package serie4.ex4;

public class Animal {
     protected String nom;
     protected String couleur;
     protected String sexe;
     
     public Animal(String n){
     this.nom = n;
     } 
     public void manger(){
       System.out.println(this + " manger");
     }
     public void dormir(){
       System.out.println(this + " dormir");
     }

    @Override
    public String toString() {
        return nom;
    }
     
} 
