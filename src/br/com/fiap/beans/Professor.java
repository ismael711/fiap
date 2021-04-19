package br.com.fiap.beans;

public class Professor {

	private String nome;
	private String formacao;
	private float salario;
	private Endereco endereco;
	
	public String aplicarDissidio(float porcentagem) {
		if(porcentagem>0) {
		salario = salario + salario  * (porcentagem / 100);
		}
		return "Dissídio aplicado";
	}
	
	public void setAll(String nome, String formacao, Float salario, Endereco endereco) {
		this.nome = nome;
		this.formacao = formacao;
		this.salario = salario;
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", formacao=" + formacao + ", salario=" + salario + ", endereco=" + endereco
				+ "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public Float getSalario() {
		return salario;
	}
	public void setSalario(Float salario) {
		this.salario = salario;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Professor(String nome, String formacao, int i, Endereco endereco) {
		super();
		this.nome = nome;
		this.formacao = formacao;
		this.salario = i;
		this.endereco = endereco;
	}
	
	public Professor() {
		super();
	}
	
	
	
	
}
