package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Endereco;

public class ImplementarAluno {

	public static void main(String[] args) {
		
		Aluno objeto = new Aluno();
		objeto.setEmail("ismael711@gmail.com");
		objeto.setFone("945836282");
		objeto.setNome("Ismael");
		objeto.setRm(123);
		
		System.out.println(objeto.getEmail());
		System.out.println(objeto.getFone());
		System.out.println(objeto.getRm());
		System.out.println(objeto.getNome());
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Av. Lins de Vasconcelos");
		endereco.setNumero("1222");
		endereco.setBairro("Aclimação");
		endereco.setCidade("São Paulo");
		endereco.setUf("SP");
		endereco.setCep("03553-090");
		
		Aluno objeto2 = new Aluno();
		objeto2.setAll(
				456,
				"XPTO",
				"XPTO@xpto.com.br",
				"4321-0000",
				endereco
				);
		
		System.out.println(objeto2.toString());

	}

}
