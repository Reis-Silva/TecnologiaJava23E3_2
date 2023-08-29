package br.edu.inftnet.model.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.inftnet.model.domain.Comida;
import br.edu.inftnet.model.domain.Pedido;
import br.edu.inftnet.model.domain.Produto;
import br.edu.inftnet.model.domain.Solicitante;

public class SolicitanteTest {

	public static void main(String[] args) {
		
		File layoutSolicitanteEntrada = new File("solicitanteEntrada.txt");

		File layoutPedidoEntrada = new File("pedidosEntrada.txt");
		
		File layoutComidaEntrada = new File("comidasEntrada.txt");
		
		String caminhoSaida = "solicitanteSaida.txt";
		
		List<Solicitante> solicitantes = new ArrayList<Solicitante>();
		solicitantes.add(new Solicitante("Julio", "00000000001", "teste1@gmail.com"));
		solicitantes.add(new Solicitante("Cesar", "00000000002", "teste2@gmail.com"));
		solicitantes.add(new Solicitante("Reis", "00000000003", "teste3@gmail.com"));
						
		List<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos.add(new Pedido("Pedido 1"));
		pedidos.add(new Pedido("Pedido 2"));
		pedidos.add(new Pedido("Pedido 3"));
		
		List<Comida> comidas = new ArrayList<Comida>();
		comidas.add(new Comida(350f, true, "salada", "Tomate, Cebola, Pepino, alface, Manga, Batata Doce", 15.50f, 4));
		comidas.add(new Comida(800f, false, "Arroz com Galinha", "Arroz Pasterizado, Peito de frango com molho Barbecue e alho Imerso ao queijo", 20.0f, 5));
		comidas.add(new Comida(600f, false, "Filé de Posco e Alcatra", "Molho mexicano com Carne de Filé em tiras e Carne de Porco ao molho Italiano", 50.00f, 6));

		Scanner dadosEntrada = null;
		
		Scanner dadosComidaEntrada = null;
		
		System.out.println(Produto.buscarSaudacaoAtual());
		
		try {
			
			dadosEntrada = new Scanner(layoutPedidoEntrada);
			
			while(dadosEntrada.hasNextLine()) {
				System.out.println(dadosEntrada.nextLine());
			}			
			
			BufferedWriter layoutSaida = new BufferedWriter(new FileWriter(caminhoSaida));
			
			dadosComidaEntrada = new Scanner(layoutComidaEntrada);
			
			while(dadosEntrada.hasNextLine()) {
				System.out.println(dadosEntrada.nextLine());
			}			
			
			for(Solicitante solicitante : solicitantes ) {
				System.out.println("Solicitante: " + solicitante.getNome() + "\n");
				layoutSaida.write("Solicitante: " + solicitante.getNome() + "\n");
				layoutSaida.write(solicitante.toString() + "\n");
				
				for(Pedido pedido : pedidos) {
					System.out.println("Pedido Solicitado: \n");
					System.out.println(pedido.getDescricaoao() + "\n");
					
					for(Comida comida : comidas) {
						layoutSaida.write(comida.toString() + "\n");
						System.out.println(comida.toString() + "\n");
					}
					System.out.println(pedido.toString() + "\n");
				}
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
