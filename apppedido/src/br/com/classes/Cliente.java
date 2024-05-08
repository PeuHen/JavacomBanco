package br.com.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Cliente {
	private String nome;
	private String telefone;
	private String email;
	private int idade;
	
	
	
public void salvar() {
		
		// tratar exeçoes do codigo
		try (Connection connector = db_Connection.conectar()){ // conexao ao banco
			
			PreparedStatement smt = connector.prepareStatement("insert into cliente(nome,telefone,email,idade)values(?,?,?,?)");
			//permite um comando diferente do java e jogar dentro do eclipse (e ele reconhcer)
				smt.setString(1, nome);
				smt.setString(2, telefone);
				smt.setString(3, email);
				smt.setInt(4, idade);
				smt.executeUpdate();
		} catch (Exception e) { //exception e = erros;
			
			e.printStackTrace(); //listar erros
		}
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
		


	

}
