import java.math.BigDecimal;
import java.math.RoundingMode;

public class SeaPokemon extends WaterPokemon {

	private float vitesse;
	public SeaPokemon(String nom, float poids, int nbNageoires) {
		super(nom,poids,nbNageoires);
		
		vitesse = poids/25*nbNageoires;
		// TODO Auto-generated constructor stub
	}
	
	


	


	/**
	 * 
	 */
	public SeaPokemon() {
		super();
		// TODO Auto-generated constructor stub
	}




	/**
	 * @param nom
	 */
	public SeaPokemon(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}




	/**
	 * @param nom
	 * @param poids
	 * @param vitesse
	 * @param taille
	 */
	public SeaPokemon(String nom, float poids, double vitesse, float taille) {
		super(nom, poids, vitesse, taille);
		// TODO Auto-generated constructor stub
	}




	/**
	 * @param nom
	 * @param poids
	 */
	public SeaPokemon(String nom, float poids) {
		super(nom, poids);
		// TODO Auto-generated constructor stub
	}




	














	/**
	 * @param vitesse the vitesse to set
	 */
	public void setVitesse(float vitesse) {
		this.vitesse = vitesse;
	}







	@Override
	public String toString() {
		return "SeaPokemon [vitesse=" + vitesse + ", getVitesse()=" + getVitesse() + ", getPoids()=" + getPoids()
				+ ", getNbNageoires()=" + getNbNageoires() + ", getNom()=" + getNom() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}




	@Override
	protected double getVitesse() {
		// TODO Auto-generated method stub
		return round(vitesse,1);
	

	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	
	
	
	/*
	 * public static double getVitesse() { return vitesse; }
	 */
	
	


}
