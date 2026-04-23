package mod8_Operaçoes_Logicas_Condicionais_Relacionais;

public class Aula7_8_9_Estrutura_repeticao_fOR {

	public static void main(String[] args) {

		/*
		 * estrutura de repetição for e muito usado na programação para varer alguma
		 * determina variavel
		 */

		/*
		 * FOR(enquanto), varialvel i de valor = 0 ; for iqual ou menor que 10 variavel
		 * i recebe +1 e imprimi i. o resultado vai ser de 0 a 10 crescente
		 */
		for (int numero1 = 0; numero1 <= 10; numero1++) {

			System.out.println(numero1);

		/*========fim aula=============*/
			
			/*Aula8- Parando a estrutura de repetição com break*/
			
			/*usando Oque aprendemos acima vamos cria uma laço de repetição*/
			for (int numero2 = 0; numero2 <=10; numero2++) {
				
				/*
				 * usaremos uma condição para se achar o numero 7 apos achar imprimimos e
				 * aplicamos um break para parar o codigo.
				 */
				if (numero2 == 7) {

					System.out.println("encontrei " + numero2);
					System.out.println("estou parando");
					break;	
				}
				
				/*Note Que assimque encoutro o codigo parou o codigo.*/
			}

		}

		/* =============== Fim aula =========== */

		/* Aula 9 -Estrutura de repeticão e continue */

		/*
		 * FOR(enquanto), varialvel i de valor = 10 ; for iqual ou maior que 0 variavel
	i recebe -1 e imprimi i. o resultado vai ser de 10 a 0 decrescente.
		 * 
		 */

		for (int i = 0; i >= -10; i--) {

			System.out.println(i);
			
			/*
			 * usamos uma condição para se achar o numero -5 apos achar imprimimos e
			 * aplicamos um continue para continuar a verificação o codigo.
			 */

			if (i == -5) {

				System.out.println("Encontrei o valor negativo de: " + i);
				continue;
				/*
				 Note que Diferentimente da condição acima, 
				 a verificação continuou até a estrutura de 
				 repetição terminar.
				 * 
				*/
			}

		}

	}

}
