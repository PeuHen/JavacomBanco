package br.com.classes;


import java.util.ArrayList;
import java.util.List;




public class Pedido {
	
	public List<Produto> produtos = new ArrayList<>();
	public int numero;
	public Cliente Cliente;
	
	
	







	public void mostrarPedido(){
	    System.out.println("_______________________________________");
	    System.out.println("Numero do Pedido: " + numero);
	    System.out.println("_______________________________________");
	    System.out.println("nome do Cliente: " + Cliente.getNome());
	    System.out.println("telefone do cliente: " + Cliente.getTelefone());
	    System.out.println("E-mail do cliente: "+ Cliente.getEmail());
	    System.out.println("_________________________________________");
	    System.out.println("itens do pedido");
	    System.out.println("_________________________________________");
	    
	    for(Produto p : produtos) {
	          System.out.println("--" + p.getDescricao());
	          System.out.println("--" + p.getValor());
	        }
	    }
	       
	}
