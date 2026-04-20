package mod8_Operaçoes_Logicas_Condicionais_Relacionais;



public class Aula4_Switch_Case {
	
	public static void main(String[] args) {
		
		/*Switch = Usado para realizar condiçoes exatas
		 
		 *Exemplo: 
		 Vamos Verificar o dia da Semana*/
		
		int dia = 10;
		
	switch (dia) {
	/*Caso do dia = 1 imprimi "Domingo"*/
	case 1:
		System.out.println("Domingo");
		
		/*Parar a Condição assim que a encontra*/
		break;
		
	/*Caso do dia = 2 imprimi "Segunda", assim por Diante */
	case 2 :
		System.out.println("Segunda");
		break;
	
	case 3 :
		System.out.println("Terça");
		break;
	
	case 4 :
		System.out.println("Quarta");
		break;
	
	case 5 :
		System.out.println("Quinta");
		break;
		
	case 6 :
		System.out.println("Sexta");
		break;
		
	case 7 :
		System.out.println("sabado");
		break;
	
		/*Caso não encontre nenhuma condição entra no default*/
	default:
		System.out.println("Dia não existe.");
		
			
		break;
	}
/*=============FIM AULA===================*/
	
	/*AULA 06 - OPERARADORES RELACIONAIS
	 SÃO OS OPERADOS USADOS PARA CONDIÇOES DE RELAÇÃO:
	 
	 * ==(iGUAL)
	 * !=(DIFERENTE)
	 * >=(MAIOR OU IGUAL)
	 * <=(MENOR OU IGUAL)
	 * >(MAIOR QUE)
	 * <(MENOR QUE) 
	 * 
	*AULA.1 - OPERADORES LOGICOS
	 *&- UMA DAS CONDIÇOES E VERDADEIRA(TRUE).
	 *&&-AS DUAS CONDIÇOES E VERDADIRAS
	 *||- UMA OU A OUTRA CONDIÇOES E VERDADEIRAS.
	 *
	 */
	
	

		
	}

}
