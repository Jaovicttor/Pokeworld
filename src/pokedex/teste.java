package pokedex;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Pokedex pokedex = new Pokedex();
		Scanner sc = new Scanner(System.in);
		boolean situacao = true;
		while(situacao) {
			System.out.println("---------------------------");
			System.out.println("Bem vindo(a) ao pokedex");
			System.out.println("---------------------------");
			System.out.println("0   - O que é a pokedex");
			System.out.println("1   - Cadastrar pokémon");
			System.out.println("2   - Exibir pokémon");
			System.out.println("3   - Listar pokémons encontrados");
			System.out.println("999 - Encerrar");
			
			String acao = sc.nextLine();
			
			switch(acao) {
				case "0":
					System.out.println();
					System.out.println("---------------------------");
					System.out.println(pokedex.toString());
					System.out.println("---------------------------");
					System.out.println();
					break;
					
				case "1":
					
					System.out.println();
					System.out.println("--------------------------");
					System.out.println("---Cadastre seu pokémon---");
					System.out.println("--------------------------");
					System.out.print("Nome     : ");
					String nome = sc.nextLine();
					if(nome.isBlank()) {
						System.out.println("Erro");
						break;
					}
					System.out.print("Descricao: ");
					String descricao = sc.nextLine();
					System.out.print("Elemento : ");
					String elemento = sc.nextLine();
					
					String[] localOrigem = {"Florestas de Gretsk"};
					pokedex.cadastrarPokemon(8, nome, descricao, elemento, "Terrestre", localOrigem, 2, 10, 12);
					break;
				
				case "2":
					System.out.println();
					System.out.println("----------------------------------");
					System.out.println("---Informações sobre um pokemon---");
					System.out.println("----------------------------------");
					System.out.print("Id pokemon: ");
					int id = sc.nextInt();
					
					System.out.println(pokedex.exibirPokemon(id));
					break;
					
				case "3":
					String[] pokemons = pokedex.listarPokemons();
					for (int i = 0; i < pokemons.length; i++) {
						System.out.println();
						System.out.println(pokemons[i]);
						System.out.println();
					}
					break;
					
				case "999":
					situacao = false;
					break;
				default:
					System.out.println("//ERRO -- OPÇÃO INVÁLIDA");
			}
		}
	}

}
