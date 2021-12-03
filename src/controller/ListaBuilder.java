package controller;

import java.util.LinkedList;
import java.util.List;

public class ListaBuilder {
	public LinkedList<String> gerarlistas(String nome, LinkedList<String> lista) {
		lista.add(nome);
		return lista;
	}

	public void concatenarlistas(LinkedList<String> lista1, LinkedList<String> lista2) {
		LinkedList<String> listas_unidas = new LinkedList<String>();
		int tamanholista1 = 0;
		int tamanholista2 = lista2.size();
		
		if(tamanholista1>tamanholista2) {
			while(true) {
				listas_unidas.add(lista1.get(tamanholista1));
				listas_unidas.add(lista2.get(tamanholista2));
		
				tamanholista1++;
				tamanholista2--;
			}
		}
		
	}
}
