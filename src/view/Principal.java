package view;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import controller.ListaBuilder;

public class Principal {

	public static void main(String[] args) {
		LinkedList<String> lista1 = new LinkedList<String>();
		LinkedList<String> lista2 = new LinkedList<String>();
		LinkedList<String> lista_decrescente = new LinkedList<String>();

		ListaBuilder builder = new ListaBuilder();

		String[] nome = { "H", "U", "G", "O" };
		String[] sobrenome = { "V", "I", "N", "I", "C", "I", "O", "S" };

		for (int i = 0; i < nome.length; i++) {
			lista1 = builder.gerarlistas(nome[i], lista1);
		}

		for (int i = 0; i < sobrenome.length; i++) {
			lista2 = builder.gerarlistas(sobrenome[i], lista2);
		}

		builder.concatenarlistas(lista1, lista2);

	}
}
