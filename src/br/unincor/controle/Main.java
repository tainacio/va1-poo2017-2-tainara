package br.unincor.controle;

import java.util.ArrayList;
import java.util.List;
import br.unincor.exception.EvolucaoException;
import br.unincor.model.Pokemon;
import br.unincor.view.Usuario;

public class Main {

	public static void main(String[] args) {
		Usuario u = new Usuario();
		Operacoes v = new Operacoes(); 
		List<Pokemon> listaPokemons = new ArrayList<Pokemon>();
		
		Long quantPokemon = u.recebeLong("Entre com a qtd de  pokemons: ");
		
		for(int i = 0; i < quantPokemon; i++);
		
		for(int i = 0; i < listaPokemons.size(); i++){
			try{
				v.evoluir(listaPokemons.get(i));
			}catch(EvolucaoException ee){
				u.exibeMsgErro(ee.getMessage());
			}
		}
		
		u.exibeMsg("Maior CP: " + v.maiorCp(listaPokemons).toString());
		u.exibeMsg("Menor CP: " + v.menorCp(listaPokemons).toString());
	}

}