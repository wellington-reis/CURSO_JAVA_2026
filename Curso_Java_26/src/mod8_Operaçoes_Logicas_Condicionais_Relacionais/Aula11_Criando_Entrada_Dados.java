package mod8_Operaçoes_Logicas_Condicionais_Relacionais;

/*Nesta aula vamos criar nosso 1° programinha uma calculador de IMC.
 ultilizando entrada de dados e apresentando na tela fora do console.*/

/*Uma Class de ferramentas Java que faz com que seja aprensentada 
 * caixas de dialogo no sistema*/
import javax.swing.JOptionPane;

public class Aula11_Criando_Entrada_Dados {

	public static void main(String[] args) {

		/* A varialvel recebe entrada de dados */
		String nomeAluno = JOptionPane.showInputDialog("Qual nome do aluno:");
		String dataNascimento = JOptionPane.showInputDialog("Ano de Nascimento:");
		String altura = JOptionPane.showInputDialog("Qual sua Altura:");
		String peso = JOptionPane.showInputDialog("Qual seu peso:");

		/*
		 * Como recebemos os Dados como Strings teremos de fazer a conversão para tipos
		 * numericos para se fazer operaçoes matematicas.
		 */

		/* A Variavel recebe os dados convertidos para tipo numerico Double */
		Double nDataNascimento = Double.parseDouble(dataNascimento);
		Double nAltura = Double.parseDouble(altura);
		Double nPeso = Double.parseDouble(peso);

		/*
		 * A Variavel recebe uma operação matematica e converte de double para inteiro.
		 */
		int imc = (int) (nPeso / (nAltura * nAltura));
		int idadeAluno = (int) (2026 - nDataNascimento);

		/* Intanciar uma varialvel para obter o resultado */
		String resultadoImc;

		if (imc >= 18) {

			if (imc >= 18 && imc < 25) {

				resultadoImc = "PARABENS ! Você esta com peso normal";

			} else if (imc >= 25 && imc < 30) {

				resultadoImc = "ATENÇÃO! Você está com Sobre peso";

			} else {

				resultadoImc = "CUIDADO !!! Você Está Obeso ";
			}

		} else {
			resultadoImc = "abaixo do peso";
		}

		JOptionPane.showMessageDialog(null, "Nome do Aluno : " + nomeAluno + "\n" + "Idade : " + idadeAluno + " anos\n"
				+ "IMC : " + imc + "\n" + resultadoImc);

			
		
		int opTreino = JOptionPane.showConfirmDialog(null, "Deseija conhecer Os Planos de Treinos para Você?");
		
			if (opTreino == 0) {

				JOptionPane.showMessageDialog(null, "Parabéns pela Decisão");

			} else {
				JOptionPane.showMessageDialog(null, "Não Desista de Você");
				
			}


			
		
		
	}

}
