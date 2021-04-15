
public class PokemonFlemmard extends GroundPokemon {

	private double vitesse;
	private int nbHeureTVPerJour;
	public PokemonFlemmard(String nom, float poids,int nbPattes,float taille, int nbHeureTVPerJour ) {
		super(nom, poids,nbPattes,taille);
		this.nbHeureTVPerJour = nbHeureTVPerJour;
		vitesse = nbPattes*taille*3;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "PokemonFlemmard [vitesse=" + vitesse + ", nbHeureTVPerJour=" + nbHeureTVPerJour + ", nbPattes="
				+ nbPattes + ", getVitesse()=" + getVitesse() + ", getNbPattes()=" + getNbPattes() + ", getTaille()="
				+ getTaille() + ", getNom()=" + getNom() + ", getPoids()=" + getPoids() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	@Override
	protected double getVitesse() {
		// TODO Auto-generated method stub
		return vitesse;
	}

	
	
	
	
	
	

}
