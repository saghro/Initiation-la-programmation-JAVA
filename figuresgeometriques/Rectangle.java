
package serie4.figuresgeometriques;

class Rectangle extends Figures {

	private double largeur;
	private double longueur;

	public Rectangle(double x, double y, double larg, double longueur) {
		super(x, y);
		this.largeur = larg;
		this.longueur = longueur;
	}

	public double surface() {
		return largeur * longueur;
	}

	public double getLongueur() {
		return longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double l) {
		largeur = l;
	}

	public void setLongueur(double l) {
		longueur = l;
	}

        @Override
	public void affiche(){
		super.affiche();
		System.out.println("Largeur = " + largeur);
		System.out.println("Longeur = " + longueur);
	}
}
