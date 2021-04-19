package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Curso;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Professor;
import br.com.fiap.beans.Turma;

public class ImplementarTurma {

	public static void main(String[] args) {
		
		Turma turma = new Turma(
				1,
				"1C",
				"M",
				new Curso(
						2,
						"desc",
						200,
						5000,
						"Especialização"
						),
				new Aluno(
						14,
						"Ismael",
						"ismael711@gmail.com",
						"94583-6282",
						new Endereco("Rua São Donaciano", "36", "", "Cidade Patriarca", "São Paulo", "SP", "03553-090")
						),
				new Professor(
						"Humberto",
						"Sistemas",
						10000,
						new Endereco("Rua A", "1", "", "Aclimação", "São Paulo", "SP", "03553-090")
						)
				);
		
		System.out.println("Nome do prodessor: " + turma.getProfessor().getNome());
		System.out.println("Nome do aluno: " + turma.getAluno().getNome());
		System.out.println("Log do aluno: " + turma.getAluno().getEndereco().getLogradouro());
		System.out.println("Desc do curso: " + turma.getCurso().getDescricao());
		System.out.println("Valor do curso: " + turma.getCurso().getValor());

	}

}
