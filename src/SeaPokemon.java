
public class SeaPokemon extends WaterPokemon {

	private double vitesse;
	public SeaPokemon(String nom, float poids, int nbNageoires) {
		super(nom, poids, nbNageoires);
		
		vitesse = poids/25*nbNageoires;
		// TODO Auto-generated constructor stub
	}
	
	


	@Override
	public String toString() {
		return "SeaPokemon [vitesse=" + vitesse + ", nbNageoires=" + nbNageoires + ", getVitesse()=" + getVitesse()
				+ ", getNbNageoires()=" + getNbNageoires() + ", getTaille()=" + getTaille() + ", getNom()=" + getNom()
				+ ", getPoids()=" + getPoids() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}




	@Override
	protected double getVitesse() {
		// TODO Auto-generated method stub
		return vitesse;
	

	}
	
	
	
	
	/*
	 * public static double getVitesse() { return vitesse; }
	 */
	
	


}
