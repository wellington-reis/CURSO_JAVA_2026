package mod9_Classes_Atributos;

import java.text.BreakIterator;

public class Aluno {
	/* 01- criando Atributos comuns ao objeto */
	String nome;
	String dataNacimento;
	String cpf;
	Double altura;
	Double peso;
	Boolean limitacao;

	/* Construtor e cria os dados na memoria do java */
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, Boolean limitacao) {

	}

	/* A-10: Setters e getters
	 * Click com botao direto, source-> generate getters e setters. */
	
	
	public String getNome() {
		return nome;
		/*public(pode ser acessada de qualquer lugar no java.
		 * getnome(referência)
		 * String nome (tipo)
		 * atributo(nome) Recebe o valor que
		 * será atribuido pelo setnome ou direto por paramentro.
		 * Retorna o valor atribuido. 
		 * 
		 */
	}

		public void setNome(String nome) {
		/* O this. indica para o java que o atributo e deste objeto. */
		this.nome = nome;
		
		/*public(pode ser acessada de qualquer lugar no java.
		 * void - recebe e nao retorna.
		 * Setnome(referência)
		 * String (tipo)
		 * nome(Atributo) 
		 * Recebe o valor que será atribuido a nome.
		 */

	}

	public String getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Boolean getLimitacao() {
		return limitacao;
	}

	public void setLimitacao(Boolean limitacao) {
		this.limitacao = limitacao;
	}

	/*A11- criação do metodo de calculo de imc 
	 Vamos criar um metodo que vai nos retornar o calculo:
	*/
	
	public Double getCalculoImc() {
		
		/* peso divido por altura ao quadrado.*/
		return peso / (altura * altura);
	}

	/* Criação de método de condição de Massa Corporia */
	public String getResultadoImc() {

		Double resultado = this.getCalculoImc();

		if (resultado > 20) {

			if (resultado >= 30) {

				return "Aluno Obeso";

			} else if (resultado >= 25) {

				return "Aluno Acima do Peso";

			} else {

				return "Aluno com peso normal.";
			}

		} else {
			return "Aluno abaixo do peso";
		}
	}

	/* A15- CRIACAO METODO toSTRING */
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", altura=" + altura + ", peso=" + peso + "]";
	}

}