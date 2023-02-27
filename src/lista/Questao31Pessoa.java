package lista;

public class Questao31Pessoa {
	private int cpf;
	private String nome;
	private int idade;
	private char sexo;
	private double peso;
	private double altura;
	private double imc;

	public Questao31Pessoa(int cpf, String nome, int idade, char sexo, double peso, double altura) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.imc = peso / (altura * altura);
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public String toString() {
		return "CPF: " + cpf + " | Nome: " + nome + " | Idade: " + idade + " | Sexo: " + sexo + " | Peso: " + peso
				+ " kg | Altura: " + altura + " m | IMC: " + imc;
	}
}