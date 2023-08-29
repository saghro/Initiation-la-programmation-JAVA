
package serie4.figuresgeometriques;


public class Figures {
    // abscisse du centre 
    private double x;    
// ordonnee du centre  
    private double y;  
    public Figures(double x , double y){
        this.x = x;
        this.y = y; 
    }        
    public void affiche() {        
        System.out.println("centre = (" +  x + ", " + y + ")");

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void setCentre(double x, double y) {
		this.x = x;
		this.y = y;
	}
}