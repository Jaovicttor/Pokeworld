package pokedex;

public class Pokedex {
	
	Pokemon[] pokemons;
	int pokemonsCadastrados;
	
	Pokedex() {
		this.pokemons = new Pokemon[999];
		this.pokemonsCadastrados = 3;
		
		String[] localOrigem = {"Florestas de Gretsk"};
		Pokemon p1 = new Pokemon(001, "Bulbasaur ","Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. "
												+ "A semente cresce lentamente.", 
												"Planta", "Terrestre", localOrigem, 
												3, 25, 15);
		
		
		String[] localOrigem2 = {"Ilhas Galapactus", "Vulcão de Chimeria"};
		Pokemon p2 = new Pokemon(004, "Charmander","Desde o nascimento, uma chama queima na ponta de sua cauda. "
												+ "Sua vida terminaria se a chama se apagasse.", 
												"Fogo", "Terrestre", localOrigem2, 
												4, 30, 9);
		
		String[] localOrigem3 = {"Praia de Blastoise"};
		Pokemon p3 = new Pokemon(007, "Squirtle","Quando se sente ameaçado, "
												+ "puxa seus membros para dentro de sua concha e "
												+ "borrifa água de sua boca.", 
												"Agua", "Anfíbio", localOrigem3, 
												3, 20, 20);
		
		this.pokemons[0] = p1;
		this.pokemons[1] = p2;
		this.pokemons[2] = p3;
	}

	public String toString() {
		return "A pokedex é o dispositivo que irá te ajudar na sua jornada como mestre pokémon.";
	}
	
	public void cadastrarPokemon(int id, String nome, String descricao, String elemento, String tipo, String[] localOrigem, 
			int raridade, int hpMaximo, int manaMaxima) {
		
		this.setPokemons(new Pokemon(id, nome, descricao, elemento, tipo, localOrigem, raridade, hpMaximo, manaMaxima));	;
		
	}
	
	public String exibirPokemon(int idPokemon) {
		if(idPokemon-- >= 0) {
			return this.pokemons[idPokemon].toString();
		}
		return null;
		
	}
	
	public String[] listarPokemons() {
		
		String[] pokemons = new String[this.pokemonsCadastrados];
		
		for (int i = 0; i < this.pokemonsCadastrados; i++) {
			pokemons[i] = this.pokemons[i].toString();
		}
		
		return pokemons;
	}
	
	//fazer listagem de evoluções
	
	private void setPokemons(Pokemon pk) {
		if(this.pokemonsCadastrados < 1000) {
			this.pokemons[this.pokemonsCadastrados++] = pk;
		}
	}
}
