
public abstract class WaterPokemon extends Pokemon {
	
	// charact propre à waterpokemon
	int nbNageoires;

	public WaterPokemon(String nom, float poids, int nbNageoires) {
		super(nom, poids);
		this.nbNageoires = nbNageoires;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the nbNageoires
	 */
	public int getNbNageoires() {
		return nbNageoires;
	}

	/**
	 * @param nbNageoires the nbNageoires to set
	 */
	public void setNbNageoires(int nbNageoires) {
		this.nbNageoires = nbNageoires;
	}

	//@Override
	/*public String toString() {
		return "WaterPokemon [nbNageoires=" + nbNageoires + ", nom=" + nom + ", poids=" + poids + ", vitesse=" + vitesse
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
*/
	
	
	
	
	
}
