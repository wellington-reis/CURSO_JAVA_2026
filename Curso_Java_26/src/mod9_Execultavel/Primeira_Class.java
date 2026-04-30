package mod9_Execultavel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*importando a classe atributo*/
import mod9_Classes_Atributos.Aluno;

public class Primeira_Class {
	
	public static void main(String[] args) {
		
		/*Criando o Objeto (Aluno 01) A*/
		
		/**/
		/*Criação de Objeto sem paramentros de contrutor*/
		Aluno aluno1 = new Aluno();/*A Variavel Aluno 1 é uma referênncia para a classe aluno
		*new Aluno - É uma instância ou seja criar um objeto*/
		
		/*A-14: Fazendo entrada de dados pelo cliente.*/
		String nome=JOptionPane.showInputDialog("Nome do Aluno: ");
		String altura = JOptionPane.showInputDialog("Qual sua Altura: ");
		String peso = JOptionPane.showInputDialog("Qual seu Peso: ");
		
		/*Chamando os métodos e setando com os dados enviados pelo cliente*/
		aluno1.setNome(nome);
		aluno1.setAltura (Double.parseDouble(altura));/*Double.parse- converte String em Double.*/
		aluno1.setPeso(Double.parseDouble(peso));
		
		
		
		System.out.println(aluno1);
		System.out.println("Indice de Massa Corporia: "+ aluno1.getCalculoImc());
		System.out.println("Laudo IMC: " + aluno1.getResultadoImc());
		
	
		Aluno aluno2 = new Aluno();
		
		/*Criação de Objeto com um parametro do contrutor*/
		Aluno aluno3 = new Aluno("Wellington");
		/*instanciando um novo objeto aluno3 com nome padrão*/
		
		/*Criação de Objeto com um 2 parametro do contrutor*/
		Aluno aluno4 = new Aluno("Silvana", true);
		/*instanciando um novo objeto aluno4 com nome padrão e limitação padrão*/

		
		
	}

}
