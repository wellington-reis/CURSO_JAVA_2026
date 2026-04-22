package mod8_Operaçoes_Logicas_Condicionais_Relacionais;

public class Aula7_laco_for {
	
	public static void main(String[] args) {
		
		/*estrutura de repetição for e muito usado na programação para
		 varer alguma determina variavel */
		
/*FOR(enquanto), varialvel i de valor = 0 ; for iqual ou menor que 10
 variavel i recebe +1 e imprimi i.
 *o resultado vai ser de 0 a 10 crescente
		 */
		for (int i = 0; i <=10 ; i++) {
			
			System.out.println(i);
			
			/*usamos uma condição para se achar o numero 7 apos achar
			 imprimimos e aplicamos um break para parar o codigo. */
			
			if (i== 7) {
				
				System.out.println("encontrei " +i);
				System.out.println("estou parando");
				break;
			}
			
		}
/*FOR(enquanto), varialvel i de valor = 10 ; for iqual ou maior que 0
 variavel i recebe -1 e imprimi i.
 *o resultado vai ser de 10 a 0 decrescente.
				 */

		for (int i = 10; i >=0; i--) {
			
			System.out.println(i);
			
		}
	}

}
