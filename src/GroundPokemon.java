
public abstract class GroundPokemon extends Pokemon {
	// charact propre à groundpokemon
	private int nbPattes;
	private float taille;
	
	public GroundPokemon(String nom, float poids, int nbPattes, float taille) {
		super(nom, poids);
		this.nbPattes = nbPattes;
		this.taille = taille;
		
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 
	 */
	public GroundPokemon() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param nom
	 */
	public GroundPokemon(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}


	

	/**
	 * @param nbPattes
	 * @param taille
	 */
	public GroundPokemon(int nbPattes, float taille) {
		super();
		this.nbPattes = nbPattes;
		this.taille = taille;
	}


	/**
	 * @return the taille
	 */
	public float getTaille() {
		return taille;
	}


	/**
	 * @param taille the taille to set
	 */
	public void setTaille(float taille) {
		this.taille = taille;
	}


	/**
	 * @param nom
	 * @param poids
	 */
	public GroundPokemon(String nom, float poids) {
		super(nom, poids);
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the nbPattes
	 */
	public int getNbPattes() {
		return nbPattes;
	}
	/**
	 * @param nbPattes the nbPattes to set
	 */
	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}

	
	

	
	
	
	
	
	
}
