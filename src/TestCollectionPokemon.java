import java.util.ArrayList;

public class TestCollectionPokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		
		CollectionPokemon gottaCatchEmAll = new CollectionPokemon(pokedex);
		
		for(int i = 0; i<512; i++) {
		gottaCatchEmAll.addRandomPokemon();
		}
		System.out.println(gottaCatchEmAll.toString());
		//gottaCatchEmAll.showTest();
		//System.out.println(gottaCatchEmAll.ludoMarin.getNbNageoires());
		//System.out.println(gottaCatchEmAll.ludoMarathonien.getNbPattes());
		System.out.println("Somme de toutes les vitesses " + gottaCatchEmAll.sumAllVitesses());
		System.out.println("moyenne de la vitesse de tous les pokemons " + gottaCatchEmAll.moyenneAllVitesses());
		System.out.println("moyenne de la vitesse des pokemons sportifs " + gottaCatchEmAll.moyenneAllVitessesOfSportif());
		
	}

	
}
