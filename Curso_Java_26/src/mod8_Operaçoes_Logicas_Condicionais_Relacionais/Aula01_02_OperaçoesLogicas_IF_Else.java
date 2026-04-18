package mod8_Operaçoes_Logicas_Condicionais_Relacionais;

public class Aula01_02_OperaçoesLogicas_IF_Else {
	
	public static void main(String[] args) {
		
		/*Aula 01 - Operadores Logicos IF e Else */
		
		
	/*Dadoas Pessoais*/
	String NomeAluno = "Wellington Reis";/*Adicionar nome aluno*/
	String Endereço = "Rua Itaipu,985";
	String Cidade = "BH";
	String Contato = "(31)994164940";
	char genero = 'm';/*Adicionar a Letra Aqui (f) ou (m)*/
	
	System.out.println("Nome:"+NomeAluno);
	
	/*Notas*/
	int nota1 = 90;
	int nota2 = 90;
	int nota3 = 70;
	int nota4 = 70;
	double media = (nota1+nota2+nota3+nota4)/4;
	
	System.out.println("Média: "+media +" Pontos");
	

		
		/*Verificação de Condição em Char*/
		
		if (genero!='m' & genero !='f') {
			
			
			System.out.println("Sexo: Não Indentificado");
			
		}else if (genero == 'f') {
				
				
				 System.out.println("Sexo: Feminino");
					
			}else {
				
				
				 System.out.println("Sexo: Masculino ");
				 
					
		}
/*================= Fim Aula =============================*/
		
		/*Aula02 / Operacoes Ternárias.
		 
		 * Usadas para Verificar micro condiçoes.*/
	
		/* Criamos uma variável que receberá o resultado da condição. podende ser qualque 
		tipo de dado.*/
		String resultadoGenero;
		
		/*Os Acentos (?)(:) representa o IF(?) e Else (:) visto Anteriormente*/
		resultadoGenero= genero== 'f'? "Mulher" : genero=='m'? "Homen" : "LGBT";
		
		/*A Varialver X recebe o texto ( Mulher ) "SE"(?)Genero for igual a 'f' "Senão"(:) 
		 * "SE"(?) Genero for igual a 'm' Recebe o texto ( Homen ) SENÃO (:) recebe o texto (LGBT).    */
		
		/*Imprimi a Variavel no console*/
		System.out.println("Gen ID: " +resultadoGenero);
		
/*================Fim Aula===========================*/
		
		
		/*Aula03 - Operaçoes Aninhadas.
		 * São Condições dentro de condições */
		
		/*condição 01*/
		if (Cidade=="BH") {
			
			System.out.println("Campus BH");
			 
			/*Condição 02*/
			if (genero != 'f' && genero != 'm') {
				System.out.println("Dormitorios Selecionados");
				 
				   /*condição 03*/
			}else if (genero=='m') {
					
					System.out.println("Dormitórios Masculinos");
					
				}else {
					System.out.println("Dormitorios Femininos");		
					}		
			
			/*condição 04*/
			if (media >=50) {
				
				/*condição 05*/
				if (media <=100 ) {
					
					/*condição 06*/
					if (media <=70) {
						System.out.println("Grupo Melhorar");
						
					}else {
							System.out.println("Grupo CDF");
						}
				}
			}else {
					System.out.println("Não Atingiu a Media para acessar o campus");
				}
			
		}else {
			System.out.println("Campus não Indentificado:");
		}
				
	}

}
