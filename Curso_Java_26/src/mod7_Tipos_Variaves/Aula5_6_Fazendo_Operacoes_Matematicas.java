package mod7_Tipos_Variaves;
/*OBS:
  Int = tipo de dados inteiro
 */

public class Aula5_6_Fazendo_Operacoes_Matematicas {
	
	
	/*metodo main e um metodo execultavel*/
	public static void main(String[] args) {
		
		/*01-Vamos instanciar nossas variaveis do tipo int localmente no metodo main */
		int notaAluno1 = 30;
		int notaAluno2 = 50;
		int notaAluno3 = 40;
		int notaAluno4 = 53;
		
		/*02-Criar uma varialvel tipo int, que vai receber a somas das variáves*/
		int notasTotal = (notaAluno1 + notaAluno2 + notaAluno3 + notaAluno4);
		
		/*03-Criar uma Varialvel para receber a soma das notas e divir para formar a média */
		int mediaAluno = notasTotal/4; 
		
		/*Imprimir no console o Total das notas*/
		System.out.println("Nota total do Aluno = " + notasTotal );
		
		/*Imprimir no console a media das notas*/
		System.out.println("E sua nota média  = " + mediaAluno);
		
		/*Nota total do Aluno = 173
		  E sua nota média  = 43
		  
		  *Isso que foi impresso no console, Porém o resultado da média é 43,25.
		  *Isso acontece por causa do tipo de dado usado de numeros inteiros.
		  *Abaixo Vamos conhecer o tipo de dado Double que corrigi este erro, manteremos 
os mesmos dados somente trocaremos o int por double e chamaremos nosso método para ser execultado
no metodo main.*/
		
		/*Chamando o método */
		notasDecimais();		
	}
	
	public static void notasDecimais() {
		
		double nota_Aluno1 = 30;
		double nota_Aluno2 = 50;
		double nota_Aluno3 = 40;
		double nota_Aluno4 = 53;
		
		/*02-Criar uma varialvel tipo int, que vai receber a somas das variáves*/
		double notasTotal = (nota_Aluno1 + nota_Aluno2 + nota_Aluno3 + nota_Aluno4);
		
		/*03-Criar uma Varialvel para receber a soma das notas e divir para formar a média */
		double mediaAluno = notasTotal/4; 
		
		/*Imprimir no console o Total das notas*/
		System.out.println("Nota total do Aluno = " + notasTotal );
		
		/*Imprimir no console a media das notas*/
		System.out.println("E sua nota média  = " + mediaAluno);
				
	}

}
