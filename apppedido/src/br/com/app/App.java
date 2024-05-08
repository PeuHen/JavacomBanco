package br.com.app;

import java.util.Scanner;

import br.com.classes.*;

public class App extends Cliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Pedido pedido = new Pedido();
		
		Scanner campo = new Scanner(System.in);
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		
		System.out.println("Digite o nome do Cliente: ");
		cliente.setNome(campo.nextLine());
		System.out.println("Digite o telefone do cliente ");
		cliente.setTelefone(campo.nextLine());
		System.out.println("Digite o email do Cliente: ");
		cliente.setEmail(campo.nextLine());
		System.out.println("Digite a idade do Cliente: ");
		cliente.setIdade(campo.nextInt());
		cliente.salvar();
		campo.nextLine();
		
		
		System.out.println("insira o primeiro produto ");
		produto1.setDescricao(campo.nextLine());
		System.out.println("Qual o valor");
		produto1.setValor(campo.nextDouble());
		produto1.salvar();
		
		/*		
		System.out.println("insira o segundo produto ");
		produto2.setDescricao(campo.nextLine());
		System.out.println("Qual o valor");
		produto2.setValor(campo.nextDouble());	
		campo.nextLine();
		produto2.salvar();
		
		System.out.println("insira o terceiro prduto ");
		produto3.setDescricao(campo.nextLine());
		System.out.println("Qual o valor");
		produto3.setValor(campo.nextDouble());
		produto3.salvar();
		*/
		
		
		pedido.Cliente = cliente;
		pedido.numero = 1;
		/*
		pedido.produtos.add(produto2);
		pedido.produtos.add(produto2);
		pedido.produtos.add(produto3);*/
		pedido.produtos.add(produto1);
		
		pedido.mostrarPedido();
		
		
		
	}
	
}

	
		

		
	
	
	
	

	

		