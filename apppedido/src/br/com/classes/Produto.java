package br.com.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Produto {
	private int numero;
	private double total;

	private String descricao;
	private double valor;
	
	
	public void salvar() {
		
		// tratar exeçoes do codigo
		try (Connection connector = db_Connection.conectar()){ // conexao ao banco
			
			PreparedStatement smt = connector.prepareStatement("insert into produto(descricao,valor)values(?,?)");
			//permite um comando diferente do java e jogar dentro do eclipse (e ele reconhcer)
				smt.setString(1, descricao);
				smt.setDouble(2, valor);
				smt.executeUpdate();
		} catch (Exception e) { //exception e = erros;
			
			e.printStackTrace(); //listar erros
		}
		
	}
	
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	
	}
	
	

	

