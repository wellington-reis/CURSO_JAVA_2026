package mod7_Tipos_Variaves;

public class Aula7_Tipos_Texto {
	
	/*String = Texto de qualquer tamanho e configuração 
	 *Char = Texto de apenas um Caracter.*/
	
	
	public static void main(String[] args) {
		
		/*Criar um Cadastro de Pessoa com String*/
		
		String nomeAluno = "Wellington Reis";
		String Endereço = "Rua Desembargador Braulio";
		String Telefone ="31 994164940";
		
		/*Imprimir no console*/
		System.out.println("Nome do Aluno: "+ nomeAluno );
		System.out.println("Endereço: " + Endereço);
		System.out.println("telefone: " + Telefone);
		
		/*Verificar o genero da Pessoa com "CHAR", onde (m) masculino (f) feminino
		 * e qualquer outra letra Nao indentificado */
		
		char genero = 'a';/*Adicionar a Letra Aqui*/
		
		
		/*Verificação de Condição*/
		
		if (genero!='m' & genero !='f') {
			
			System.out.println("Sexo: Não Indentificado");
			
		}else if (genero == 'f') {
			
				 System.out.println("Sexo: Feminino");
					
			}else {
				
				 System.out.println("Sexo :Masculino ");
					
		}
	}
}
