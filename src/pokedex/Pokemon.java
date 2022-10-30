package pokedex;

import java.util.Arrays;
import java.util.StringJoiner;

public class Pokemon {
	
	private int id;
	private String nome;
	private String descricao;
	private String elemento;
	private String tipo;
	private String[] localOrigem;
	private int raridade;
	private boolean selvagem;
	private int xp;
	private int hpMaximo;
	private int hpAtual;
	private int manaMaxima;
	private int manaAtual;
	
	
	Pokemon(int id, String nome, String descricao, String elemento, String tipo, String[] localOrigem, 
			int raridade, int hpMaximo, int manaMaxima){
		
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.elemento = elemento;
		this.localOrigem = localOrigem;
		this.raridade = raridade;
		this.selvagem = true;
		this.xp = 0;
		this.hpMaximo = hpMaximo;
		this.hpAtual = hpMaximo;
		this.manaMaxima = manaMaxima;
		this.manaAtual = manaMaxima;
	}
	
	public boolean equals(Pokemon pk) {
		boolean result = true;
		
		if(this.nome != pk.getNome()) {
			result = false;
		}
		
		if(this.selvagem != pk.isSelvagem()) {
			result = false;
		}
		
		if(this.descricao != pk.getElemento()) {
			result = false;
		}
		
		return result;
	}
	
	public String toString() {
		
		return String.format("%s --- %d/%d - %s\n"
							+ "%s\n"
							+ "Raridade: nível %d\nEncontrador em:\n"
							+ "%s", 
				this.nome, this.hpMaximo, this.manaMaxima, this.elemento, this.descricao, this.raridade, this.localDeOrigemToString());
	}
	
	public int hashCode(){
		
		return this.id;
	}
	
	private String localDeOrigemToString() {
		StringJoiner result = new StringJoiner("\n");
		String [] locais = this.localOrigem;
		Arrays.sort(locais);
		for (String local : locais) {
			result.add(" - " + local);
		}
		return result.toString();
	}

	
	
	public String getNome() {
		return nome;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String getElemento() {
		return elemento;
	}

	
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	
	public boolean isSelvagem() {
		return selvagem;
	}

	
	public void setSelvagem(boolean selvagem) {
		this.selvagem = selvagem;
	}
	
	
}
