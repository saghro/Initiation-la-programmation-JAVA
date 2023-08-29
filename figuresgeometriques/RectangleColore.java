
package serie4.figuresgeometriques;


class RectangleColore extends Rectangle {

	private int couleur;

	public RectangleColore(double x, double y, double larg, double longeur, int couleur) {
		super(x, y, larg, longeur);
		this.couleur = couleur;
	}

        @Override
	public void affiche(){
		super.affiche();
		System.out.println("Couleur = " + couleur);
	}	
}
