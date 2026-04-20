package mod8_Operaçoes_Logicas_Condicionais_Relacionais;

public class Aula6_While_DoWhile {
	
	public static void main(String[] args) {
		
/*while é uma estrutura de repetição que execulta uma
 determinada tarefa até que conclua a condição vire (false).
*/
	int numero =0;
	int numero2 = 0;
	
	/*Primeiro Ele verifica a condição e execulta*/
	while (numero <=10) {
		
		System.out.println("o número e : "+numero);
		
		/*após ele execultar temos de atentar para somar 
		 mais um a varialvel.*/ 
		
		numero ++;/*++ add mais 1*/
		
		}
	
/*==================================*/
	
	/*DoWilhe - Primeiro Execulta depois Verifica a condição. */
	numero2 = 10;
	
	do {
		
		System.out.println("o número e : "+numero2);
		numero2 ++ ;
		
		
	} while (numero2 <=20);
		
	}
	

}
