package br.com.fiap.implementacao;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Curso;

public class ImplementarCurso {

	public static void main(String[] args) {
		
		Curso curso = new Curso(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo")),
				JOptionPane.showInputDialog("Descri��o").toUpperCase(),
				Integer.parseInt(JOptionPane.showInputDialog("Carga Hor�ria")),
				Float.parseFloat(JOptionPane.showInputDialog("Valor")),
				JOptionPane.showInputDialog("Titula��o").toUpperCase()
				);
		
		System.out.println(curso);

	}

}
