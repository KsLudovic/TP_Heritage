
public abstract class WaterPokemon extends Pokemon {
	
	// charact propre à waterpokemon
	private int nbNageoires;
	private float poids;

	public WaterPokemon(String nom, float poids, int nbNageoires) {
		super(nom);
		this.poids = poids;
		this.nbNageoires = nbNageoires;
		
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @return the poids
	 */
	public float getPoids() {
		return poids;
	}



	/**
	 * @param poids the poids to set
	 */
	public void setPoids(float poids) {
		this.poids = poids;
	}



	/**
	 * 
	 */
	public WaterPokemon() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param nom
	 */
	public WaterPokemon(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param nom
	 * @param poids
	 * @param vitesse
	 * @param taille
	 */
	public WaterPokemon(String nom, float poids, double vitesse, float taille) {
		super(nom,vitesse);
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param nom
	 * @param poids
	 */
	public WaterPokemon(String nom, float poids) {
		super(nom, poids);
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
