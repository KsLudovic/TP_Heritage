import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

// GOTTA CATCH EM ALL YEAH
public class CollectionPokemon {
	PokemonFlemmard ludoFlemmard = new PokemonFlemmard("JavaMakeMeCry",2f, 24,4,120);
	PokemonSportif ludoMarathonien = new PokemonSportif("JoachimBest",2f, 2,4,120);
	SeaPokemon ludoMarin = new SeaPokemon("LudoRequin",20f,17);
	CroisadePokemon ludoPeniche = new CroisadePokemon("Bateaumon",10f,13);
	private ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
	private Pokemon[] tabPokemonsWithDiffTypes = {ludoFlemmard,ludoMarathonien,ludoMarin,ludoPeniche};
	//private String[] namesFlemmards = {"java","make","me","wanna","cry"};
	private Random random = new Random();
	private int randomInt = random.nextInt(4);

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
	
	
	/*Supposed to change color of logs
	 * 
	 * public String getLogColor() { ArrayList<Pokemon> pokedex = new
	 * ArrayList<Pokemon>(); for(Pokemon p : pokedex) {
	 * if(p.toString().contains("PokemonSportif@")) { pokedex.add(p); return
	 * ConsoleColors.RED; } if(p.toString().contains("PokemonFlemmard@")) {
	 * pokedex.add(p); return ConsoleColors.GREEN; }
	 * if(p.toString().contains("CroisadePokemon@")) { pokedex.add(p); return
	 * ConsoleColors.BLUE; } if(p.toString().contains("SeaPokemon@")) {
	 * pokedex.add(p); return ConsoleColors.CYAN;
	 * 
	 * }
	 * 
	 * } //return null; return ConsoleColors.BLACK;
	 * 
	 * 
	 * }
	 */





	public void setPokedex(ArrayList<Pokemon> pokedex) {
		this.pokedex = pokedex;
	}

	/*
	 * public String getPokemonType() {
	 * 
	 * }
	 */


	public void addRandomPokemon()   //method adds a new Item object to the array list
	  {   //start add
	     //pokedex.add(ludo);
	    // pokedex.add(paludo);
	//	pokedex.add(new PokemonFlemmard(namesFlemmards[randomInt],2f,1,2,20));
		
		pokedex.add(tabPokemonsWithDiffTypes[randomInt]);
		randomInt = 0;
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
	return (double)Math.round((float)sum/getAllVitesses().size()) * 1000d / 1000d;
	
	}
	
	public double sumAllVitesses(){ 
		double sum = 0;
		for(Double d : getAllVitesses())
		    sum += d;
		return (double)Math.round(sum * 1000d) / 1000d;
		
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
		return "CollectionPokemon [pokedex=" + pokedex  + ", getPokedex()=" + getPokedex() + ", getAllVitesses()="
				+ getAllVitesses() + ", moyenneAllVitesses()=" + moyenneAllVitesses() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}





	
	



	
	
	
	
	
	
	
	
	

}
