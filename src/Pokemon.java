
public abstract class Pokemon {
	
	
	/**
	 * 
	 */
	public Pokemon() {
		super();
	}
	/**
	 * @param nom
	 * @param poids
	 * @param vitesse
	 * @param taille
	 */
	public Pokemon(String nom, double vitesse) {
		super();
		this.nom = nom;
		
		this.vitesse = vitesse;
		
	}
	
	/**
	 * @param nom
	 */
	public Pokemon(String nom) {
		super();
		this.nom = nom;
	}

	// pokemon characteristics 
	private String nom;
	
	private double vitesse;
	
	
	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}
	protected abstract double getVitesse();
	
	
	


}
