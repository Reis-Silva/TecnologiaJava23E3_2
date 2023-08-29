package br.edu.inftnet.model.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.inftnet.model.domain.Bebida;
import br.edu.inftnet.model.domain.Produto;

public class BebidaTest {

	public static void main(String[] args) {
		
		File layoutEntrada = new File("bebidasEntrada.txt");
		
		String caminhoSaida = "bebidasSaida.txt";
				
		List<Bebida> bebidas = new ArrayList<Bebida>();
		bebidas.add(new Bebida(true, 350f, "Coca-Cola", "Refrigerante", 4.50f, 1));
		bebidas.add(new Bebida(false, 50f, "Jack Daniels Old 7", "Whisky", 20.0f, 2));
		bebidas.add(new Bebida(true, 350f, "RedBull", "Energético", 10.00f, 3));

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
			
			for(Bebida bebida : bebidas) {
				layoutSaida.write(bebida.toString() + "\n");
				System.out.println(bebida.toString() + "\n");
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
