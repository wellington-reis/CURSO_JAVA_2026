package mod7_Tipos_Variaves;
/*OBS:
  Int = tipo de dados inteiro
 
 */

public class Aula5_Fazendo_Operacoes_Matematicas {
	
	
	/*metodo main e um metodo execultavel*/
	public static void main(String[] args) {
		
		/*01-Vamos instanciar nossas variaveis do tipo int localmente no metodo main */
		int notaAluno1 = 30;
		int notaAluno2 = 50;
		int notaAluno3 = 40;
		int notaAluno4 = 50;
		
		/*02-Criar uma varialvel tipo int, que vai receber a somas das variáves*/
		int notasTotal = (notaAluno1 + notaAluno2 + notaAluno3 + notaAluno4);
		
		/*03-Criar uma Varialvel para receber a soma das notas e divir para formar a média */
		int mediaAluno = notasTotal/4; 
		
		/*Imprimir no console o Total das notas*/
		System.out.println("Nota total do Aluno = " + notasTotal );
		
		/*Imprimir no console a media das notas*/
		System.out.println("E sua nota média  = " + mediaAluno);
			
		
	}
	
	

}
