
public class CroisadePokemon extends WaterPokemon {
	
	private float vitesse;
	private float poids;
	public CroisadePokemon(String nom, float poids, int nbNageoires) {
		super(nom,nbNageoires);
		this.poids = poids;
		vitesse = (poids/25*nbNageoires)/2;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	public CroisadePokemon() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 */
	public CroisadePokemon(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param poids
	 * @param vitesse
	 * @param taille
	 */
	public CroisadePokemon(String nom, float poids, double vitesse, float taille) {
		super(nom, poids, vitesse, taille);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param poids
	 */
	public CroisadePokemon(String nom, float poids) {
		super(nom, poids);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "CroisadePokemon [vitesse=" + vitesse + ", nbNageoires=" + getNbNageoires() + ", getVitesse()=" + getVitesse()
				+ ", getNbNageoires()=" + getNbNageoires() + ", getNom()=" + getNom()
				+ ", getPoids()=" + getPoids() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
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

	@Override
	protected double getVitesse() {
		// TODO Auto-generated method stub
		return vitesse;
	}

	/**
	 * @param vitesse the vitesse to set
	 */
	public void setVitesse(float vitesse) {
		this.vitesse = vitesse;
	}
	
	
	
	
	

}
