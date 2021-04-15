
public class PokemonSportif extends GroundPokemon {
	private double vitesse;
	private int pulsePerMinut;
	public PokemonSportif(String nom, float poids, int nbPattes,float taille, int pulsePerMinut) {
		super(nom, poids,nbPattes, taille);
		this.pulsePerMinut = pulsePerMinut;
		vitesse = nbPattes*taille*3;
		// TODO Auto-generated constructor stub
	}
	
	




	



	@Override
	public String toString() {
		return "PokemonSportif [vitesse=" + vitesse + ", pulsePerMinut=" + pulsePerMinut + ", nbPattes=" + nbPattes
				+ ", getPulsePerMinut()=" + getPulsePerMinut() + ", getVitesse()=" + getVitesse() + ", getNbPattes()="
				+ getNbPattes() + ", getTaille()=" + getTaille() + ", getNom()=" + getNom() + ", getPoids()="
				+ getPoids() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
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
