package br.edu.inftnet.model.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.inftnet.model.domain.Comida;
import br.edu.inftnet.model.domain.Produto;

public class ComidaTest {

	public static void main(String[] args) {
		File layoutEntrada = new File("comidasEntrada.txt");
		
		String caminhoSaida = "comidasSaida.txt";
				
		List<Comida> comidas = new ArrayList<Comida>();
		comidas.add(new Comida(350f, true, "salada", "Tomate, Cebola, Pepino, alface, Manga, Batata Doce", 15.50f, 4));
		comidas.add(new Comida(800f, false, "Arroz com Galinha", "Arroz Pasterizado, Peito de frango com molho Barbecue e alho Imerso ao queijo", 20.0f, 5));
		comidas.add(new Comida(600f, false, "Filé de Posco e Alcatra", "Molho mexicano com Carne de Filé em tiras e Carne de Porco ao molho Italiano", 50.00f, 6));

		Scanner dadosEntrada = null;
		
		System.out.println(Produto.buscarSaudacaoAtual());
		
		try {
			
			dadosEntrada = new Scanner(layoutEntrada);
			
			while(dadosEntrada.hasNextLine()) {
				System.out.println(dadosEntrada.nextLine());
			}			
			
			BufferedWriter layoutSaida = new BufferedWriter(new FileWriter(caminhoSaida));
			
			System.out.println("Pedido Solicitado: \n");
			layoutSaida.write("Pedido Solicitado: \n");
			
			for(Comida comida : comidas) {
				layoutSaida.write(comida.toString() + "\n");
				System.out.println(comida.toString() + "\n");
			}
			
			layoutSaida.flush();

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(dadosEntrada != null) {
				dadosEntrada.close();
			}
		}
	}	
}
