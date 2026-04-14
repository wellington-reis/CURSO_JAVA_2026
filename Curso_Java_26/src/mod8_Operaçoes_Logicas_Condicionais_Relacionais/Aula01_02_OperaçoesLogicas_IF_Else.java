package mod8_Operaçoes_Logicas_Condicionais_Relacionais;

public class Aula01_02_OperaçoesLogicas_IF_Else {
	
	public static void main(String[] args) {
		
		/*Aula 01 - Operadores Logicos IF e Else */
		
	char genero = 'a';/*Adicionar a Letra Aqui*/
	int idsexo = 0;
		
		/*Verificação de Condição em Char*/
		
		if (genero!='m' & genero !='f') {
			
			
			System.out.println("Sexo: Não Indentificado");
			
		}else if (genero == 'f') {
				
				idsexo = 1;
				 System.out.println("Sexo: Feminino");
					
			}else {
				
				idsexo = 2;
				
				 System.out.println("Sexo :Masculino ");
				 
					
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
		System.out.println(resultadoGenero);
		
	}

}
