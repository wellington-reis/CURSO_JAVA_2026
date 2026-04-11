package mod7_Tipos_Variaves;
/*OBS:
 * MÉTODO - E um Grupo de codigo que reliza alguma tarefa.*/

public class Aula4_VariavelLocal_e_Global {
	
	/*A Váriavel GLOBAL pode se usada por todos e o seu valor é compartilhado com todos os metodos */
	static int maiorIdadeGlobal = 18;/*Varialvel GLOBAL*/
	
	/*Método 01*/
	public static void main(String[] args) {
		/*A Variavel Local so pode ser usada dentro do método*/
		int maiorIdadelocal = 16;/*Variálve LOCAL*/
		
		System.out.println("1°- A maior Idade local é " +maiorIdadelocal);
		
		/*Curiosidade*/
		/*metodo2();/*Caso o método execultado aqui muda a ordem */
		
		System.out.println("2° -A maior idade Global é " + maiorIdadeGlobal);
		
		metodo2();
	}
	
	/*Método 02*/
	public static void metodo2() {
		
		System.out.println("3° -A maior Idade Global é " + maiorIdadeGlobal);
		
	}

}
