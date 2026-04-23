package mod8_Operaçoes_Logicas_Condicionais_Relacionais;

public class Aula10_Divisao_resto {

	public static void main(String[] args) {

		int QtAlunos = 40;
		int QtVeiculo = 6;
		System.out.println("veiculos = " + QtVeiculo);
		int Vagas = QtVeiculo * 7;
		System.out.println("vagas = " + Vagas);
		double AlunoSemTrasporte = QtAlunos % Vagas;

		if (Vagas < QtAlunos) {
			System.out.println("Alunos sem Transporte= " + AlunoSemTrasporte);

			if (AlunoSemTrasporte >= 1) {
				if (AlunoSemTrasporte == 1) {
					System.out.println("Acionar serviço de moto Taxi");

				} else if (AlunoSemTrasporte >= 5) {
					System.out.println("deslocar uma van");

				} else {
					System.out.println("deslocar um carro");
				}

			}

		}else {
			System.out.println("Não precisa de carro extra");
		}

	}

}
