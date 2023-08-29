package br.edu.inftnet.model.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.inftnet.model.domain.Produto;
import br.edu.inftnet.model.domain.Sobremesa;

public class SobremesaTest {

	public static void main(String[] args) {
		File layoutEntrada = new File("sobremesasEntrada.txt");
		
		String caminhoSaida = "sobremesasSaida.txt";
				
		List<Sobremesa> sobremesas = new ArrayList<Sobremesa>();
		sobremesas.add(new Sobremesa(150f, true, "Sorvete de Ovo Maltine", "Leite condesado com Chocolate e creme de leite", 8.00f, 7));
		sobremesas.add(new Sobremesa(300f, false, "Empadão", "Frango com massa de trigo e legumes", 10.0f, 8));
		sobremesas.add(new Sobremesa(300f, true, "Torta Doce", "Chocolate com pedaços de biscoito e amora", 10.00f, 9));

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
			
			for(Sobremesa sobremesa : sobremesas) {
				layoutSaida.write(sobremesa.toString() + "\n");
				System.out.println(sobremesa.toString() + "\n");
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
