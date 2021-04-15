
public abstract class GroundPokemon extends Pokemon {
	// charact propre à groundpokemon
	int nbPattes;
	
	public GroundPokemon(String nom, float poids, int nbPattes, float taille) {
		super(nom, poids);
		this.nbPattes = nbPattes;
		
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
