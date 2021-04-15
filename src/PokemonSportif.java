
public class PokemonSportif extends GroundPokemon {
	private double vitesse;
	private int pulsePerMinut;
	public PokemonSportif(String nom, float poids, int nbPattes,float taille, int pulsePerMinut) {
		super(nom, poids,nbPattes, taille);
		this.pulsePerMinut = pulsePerMinut;
		vitesse = nbPattes*taille*3;
		// TODO Auto-generated constructor stub
	}
	
	




	



	/**
	 * 
	 */
	public PokemonSportif() {
		super();
		// TODO Auto-generated constructor stub
	}










	/**
	 * @param nom
	 */
	public PokemonSportif(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}



















	










	/**
	 * @param nom
	 * @param poids
	 * @param nbPattes
	 * @param taille
	 */
	public PokemonSportif(String nom, float poids, int nbPattes, float taille) {
		super(nom, poids, nbPattes, taille);
		// TODO Auto-generated constructor stub
	}










	/**
	 * @param nom
	 * @param poids
	 */
	public PokemonSportif(String nom, float poids) {
		super(nom, poids);
		// TODO Auto-generated constructor stub
	}


















	@Override
	public String toString() {
		return "PokemonSportif [vitesse=" + vitesse + ", pulsePerMinut=" + pulsePerMinut + ", getPulsePerMinut()="
				+ getPulsePerMinut() + ", getVitesse()=" + getVitesse() + ", getTaille()=" + getTaille()
				+ ", getNbPattes()=" + getNbPattes() + ", getNom()=" + getNom() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}










	/**
	 * @return the pulsePerMinut
	 */
	public int getPulsePerMinut() {
		return pulsePerMinut;
	}
	/**
	 * @param pulsePerMinut the pulsePerMinut to set
	 */
	public void setPulsePerMinut(int pulsePerMinut) {
		this.pulsePerMinut = pulsePerMinut;
	}






	@Override
	protected double getVitesse() {
		 //TODO Auto-generated method stub
		return vitesse;
	}
	
	
	
	

}
