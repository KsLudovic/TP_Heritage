
public abstract class Pokemon {
	
	
	// pokemon characteristics 
	private String nom;
	private float poids;
	private double vitesse;
	private float taille;
	
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
	 * 
	 */
	public Pokemon(String nom, float poids) {
		super();
		this.nom = nom;
		this.poids = poids;
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getPoids() {
		return poids;
	}
	public void setPoids(float poids) {
		this.poids = poids;
	}
	
	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}
	protected abstract double getVitesse();
	
	
	


}
