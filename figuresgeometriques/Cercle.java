
package serie4.figuresgeometriques;
class Cercle extends Figures {

	private double rayon;

	public Cercle(double x, double y, double r) {
		super(x, y);
		rayon = r;
	}

        @Override
	public void affiche() {
		super.affiche();
		System.out.println("rayon = " + rayon);
	}

	public double surface() {
		return Math.PI * rayon * rayon;
	}

	public boolean estInterieur(double x, double y) {
		return (((x - getX()) * (x - getX())
					+ (y - getY()) * (y - getY())) <= rayon * rayon);
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double r) {
		if (r < 0.0) r = 0.0;
		rayon = r;
	}
}