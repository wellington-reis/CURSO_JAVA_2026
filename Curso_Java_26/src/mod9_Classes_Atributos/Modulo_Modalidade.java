package mod9_Classes_Atributos;

import java.util.Objects;

public class Modulo_Modalidade {
	
	String Objetivo;
	boolean Nutricao;
	double Avaliacao;
	
	/*set e get*/
	
	public String getObjetivo() {
		return Objetivo;
	}
	public void setObjetivo(String objetivo) {
		Objetivo = objetivo;
	}
	public boolean isNutricão() {
		return Nutricao;
	}
	public void setNutrição(boolean nutricao) {
		Nutricao = nutricao;
	}
	public double getAvaliacao() {
		return Avaliacao;
	}
	public void setAvaliacao(double avaliacao) {
		Avaliacao = avaliacao;
	}
	
	/*Equal e hashcode*/
	@Override
	public int hashCode() {
		return Objects.hash(Avaliacao, Nutricao, Objetivo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modulo_Modalidade other = (Modulo_Modalidade) obj;
		return Avaliacao == other.Avaliacao && Nutricao == other.Nutricao && Objects.equals(Objetivo, other.Objetivo);
	}
	
	/*ToString*/
	@Override
	public String toString() {
		return "Modulo_Musculação [Objetivo=" + Objetivo + ", Nutrição=" + Nutricao + ", Avaliacao=" + Avaliacao + "]";
	}
	
	
	
	

}
