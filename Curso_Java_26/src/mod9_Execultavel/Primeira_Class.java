package mod9_Execultavel;
/*importando a classe atributo*/
import mod9_Classes_Atributos.Aluno;

public class Primeira_Class {
	
	public static void main(String[] args) {
		
		/*Criando o Objeto (Aluno 01) A*/
		
		/**/
		/*Criação de Objeto sem paramentros de contrutor*/
		Aluno aluno1 = new Aluno();/*A Variavel Aluno 1 é uma referênncia para a classe aluno
		*new Aluno - É uma instância ou seja criar um objeto
		*/
		aluno1.setNome("Wellington");
		aluno1.setAltura(1.90);
		aluno1.setPeso(90.0);
		
		System.out.println("Nome do Aluno: "+ aluno1.getNome());
		System.out.println("Altura: "+ aluno1.getAltura());
		System.out.println("Peso: "+ aluno1.getPeso());
		System.out.println("Indice de massa corporia: "+ aluno1.getCalculoImc());
		System.out.println("laudo imc:" + aluno1.getResultadoImc());
		
	
		Aluno aluno2 = new Aluno();
		
		/*Criação de Objeto com um parametro do contrutor*/
		Aluno aluno3 = new Aluno("Wellington");
		/*instanciando um novo objeto aluno3 com nome padrão*/
		
		/*Criação de Objeto com um 2 parametro do contrutor*/
		Aluno aluno4 = new Aluno("Silvana", true);
		/*instanciando um novo objeto aluno4 com nome padrão e limitação padrão*/

		
		
	}

}
