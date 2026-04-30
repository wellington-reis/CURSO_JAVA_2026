package mod9_Classes_Atributos;

public class Aluno {
	/*01- criando Atributos comuns ao objeto*/
	String nome;
	String dataNacimento;
	String cpf;
	Double altura;
	Double peso;
	Boolean limitacao;
	
	
/*Construtor e cria os dados na memoria do java */
public Aluno() {
	// TODO Auto-generated constructor stub
}
public Aluno(String nomePadrao) {
	nome = nomePadrao;
}
public Aluno(String nomePadrao, Boolean limitacao) {
	
}

/*Setterss e getters - Cada Atributo recebe o seu set e get*/
public String getNome() {
	return nome;
}
/*Setnome(referência),String nome (tipo), atributo(nome), recebe o valor que será atribuido a nome.*/
public void setNome(String nome) {
	/*O this. indica para o java que o atributo e deste objeto. */
	this.nome = nome;
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

/*criação do metodo de calcula de imc*/

public Double getCalculoImc() {
	return peso / (altura * altura) ;
}

/*Criação de método de condição de Massa Corporia*/
public String getResultadoImc() {
	
	Double resultado = this.getCalculoImc();
	
	if (resultado>=30) {
		
		return "Obeso";
	}else {
		return "tem jeito";
	}
}
}