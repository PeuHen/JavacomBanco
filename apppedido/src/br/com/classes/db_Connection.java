package br.com.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// nessa classe iremos fazer a conexao do java com banco de dados
// baixar o arquivo jdbc, plataform independent, 2º opcao


public class db_Connection {
	
	// atributos com parametros para o mysql
	public static String url = "jdbc:mysql://localhost:3306/app";
	public static String user = "aluno";
	public static String password = "toor";
	
	// metodo que envia os parametros acima para realizar
	// a conexao com o banco

	public static Connection conectar() throws SQLException{
		
		return DriverManager.getConnection(url, user,password);
	}
}
