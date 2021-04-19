package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Endereco;
import br.com.fiap.lib.Magica;

public class ImplementarAlunoConstrutor {
	
	

	public static void main (String[] args) {
		Aluno objeto = new Aluno(
				Magica.i("RM"),
				Magica.s("Nome"), 
				Magica.s("E-mail"), 
				Magica.s("Fone"),
				new Endereco(
						Magica.s("Logradouro"),
						"1222",
						"",
						"Aclimação",
						"São Paulo",
						"SP",
						"03553-090"
						)
				);
		System.out.println(objeto.toString());
	}
}
