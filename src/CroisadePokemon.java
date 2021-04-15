
public class CroisadePokemon extends WaterPokemon {
	
	private double vitesse;
	public CroisadePokemon(String nom, float poids, int nbNageoires) {
		super(nom, poids, nbNageoires);
		
		vitesse = (poids/25*nbNageoires)/2;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "CroisadePokemon [vitesse=" + vitesse + ", nbNageoires=" + nbNageoires + ", getVitesse()=" + getVitesse()
				+ ", getNbNageoires()=" + getNbNageoires() + ", getTaille()=" + getTaille() + ", getNom()=" + getNom()
				+ ", getPoids()=" + getPoids() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	protected double getVitesse() {
		// TODO Auto-generated method stub
		return vitesse;
	}
	/**
	 * @param vitesse the vitesse to set
	 */
	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}

	
	
	
	
	

}
