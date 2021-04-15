import java.util.ArrayList;

public class TestCollectionPokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		
		CollectionPokemon gottaCatchEmAll = new CollectionPokemon(pokedex);
		gottaCatchEmAll.add();
		
		System.out.println(gottaCatchEmAll.toString());
		gottaCatchEmAll.showTest();
		System.out.println(gottaCatchEmAll.moyenneAllVitesses());
		System.out.println(gottaCatchEmAll.moyenneAllVitessesOfSportif());
		
	}

	
}
