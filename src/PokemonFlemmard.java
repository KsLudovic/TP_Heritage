
public class PokemonFlemmard extends GroundPokemon {

	private double vitesse;
	private int nbHeureTVPerJour;
	public PokemonFlemmard(String nom, float poids,int nbPattes,float taille, int nbHeureTVPerJour ) {
		super(nom, poids,nbPattes,taille);
		this.nbHeureTVPerJour = nbHeureTVPerJour;
		vitesse = nbPattes*taille*3;
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 
	 */
	public PokemonFlemmard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	/**
	 * @param nom
	 */
	public PokemonFlemmard(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param nom
	 * @param poids
	 * @param vitesse
	 * @param taille
	 */
	public PokemonFlemmard(String nom, float poids, double vitesse, float taille) {
		super(nom,taille);
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param nom
	 * @param poids
	 * @param nbPattes
	 * @param taille
	 */
	public PokemonFlemmard(String nom, float poids, int nbPattes, float taille) {
		super(nom, poids, nbPattes, taille);
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param nom
	 * @param poids
	 */
	public PokemonFlemmard(String nom, float poids) {
		super(nom, poids);
		// TODO Auto-generated constructor stub
	}


	



	@Override
	public String toString() {
		return "PokemonFlemmard [vitesse=" + vitesse + ", nbHeureTVPerJour=" + nbHeureTVPerJour
				+ ", getNbHeureTVPerJour()=" + getNbHeureTVPerJour() + ", getVitesse()=" + getVitesse()
				+ ", getTaille()=" + getTaille() + ", getNbPattes()=" + getNbPattes() + ", getNom()=" + getNom()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	/**
	 * @return the nbHeureTVPerJour
	 */
	public int getNbHeureTVPerJour() {
		return nbHeureTVPerJour;
	}


	/**
	 * @param nbHeureTVPerJour the nbHeureTVPerJour to set
	 */
	public void setNbHeureTVPerJour(int nbHeureTVPerJour) {
		this.nbHeureTVPerJour = nbHeureTVPerJour;
	}


	/**
	 * @param vitesse the vitesse to set
	 */
	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}


	@Override
	protected double getVitesse() {
		// TODO Auto-generated method stub
		return vitesse;
	}

	
	
	
	
	
	

}
