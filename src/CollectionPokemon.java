import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// GOTTA CATCH EM ALL YEAH
public class CollectionPokemon {
	PokemonFlemmard paludo = new PokemonFlemmard("JavaMakeMeCry",2f, 24,4,120);
	PokemonSportif ludo = new PokemonSportif("JoachimBest",2f, 2,4,120);
	private ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();

	/**
	 * @param pokedex
	 */
	public CollectionPokemon(ArrayList<Pokemon> pokedex) {
		super();
		this.pokedex = pokedex;
	}
	
	
	
	
	
	public ArrayList<Pokemon> getPokedex() {
		return pokedex;
	}
	
	public ArrayList<Pokemon> getAllSportif() {
		ArrayList<Pokemon> pokedexSportif = new ArrayList<Pokemon>();
		for(Pokemon p : pokedex) {
			if(p.toString().contains("PokemonSportif@")) {
				pokedexSportif.add(p);
			}
				
		}
		return pokedexSportif;
			
	}





	public void setPokedex(ArrayList<Pokemon> pokedex) {
		this.pokedex = pokedex;
	}





	public void add()   //method adds a new Item object to the array list
	  {   //start add
	     pokedex.add(ludo);
	     pokedex.add(paludo);

	  }
	
	/*
	 * 
	 */
	public List<Double> getAllVitesses(){ 
		
	List<Double> vitesses = pokedex.stream().map(Pokemon -> Pokemon.getVitesse()).collect(Collectors.toList());
	return vitesses;

	}
	public double moyenneAllVitesses(){ 
	double sum = 0;
	for(Double d : getAllVitesses())
	    sum += d;
	return sum/getAllVitesses().size();
	
	}
	
	public List<Double> getAllVitessesOfSportif(){ 
		List<Double> vitessesSport = getAllSportif().stream().map(PokemonSportif -> PokemonSportif.getVitesse()).collect(Collectors.toList());
		return vitessesSport;

		}
	public void showTest(){ 
		System.out.println(getAllVitessesOfSportif());
	}
		public double moyenneAllVitessesOfSportif(){ 
		double sum = 0;
		for(Double d : getAllVitessesOfSportif())
		    sum += d;
		return sum/getAllVitessesOfSportif().size();
		
		}





	@Override
	public String toString() {
		return "CollectionPokemon [pokedex=" + pokedex + ", getPokedex()=" + getPokedex() + ", getAllVitesses()="
				+ getAllVitesses() + ", moyenneAllVitesses()=" + moyenneAllVitesses() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}





	
	



	
	
	
	
	
	
	
	
	

}
