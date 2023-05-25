package A3;

public class Vacina extends AgendamentoVeterinario {

	private String vacina;
	private int tipovacina;
	private int valorvacina;
	
	Vacina(){
	}
	Vacina (String vacina,int tipovacina, String diavet, int tipoconsulta,int valorvacina) {
		super(tipoconsulta, diavet, tipoconsulta);
		this.tipovacina= tipovacina;
		this.valorvacina = valorvacina;
		this.vacina= vacina;
	}

	public String getvacina() {
		return vacina;
	}
	public void setvacina(String vacina) {
		this.vacina = vacina;
	}
	public int getvalorvacina() {
		return valorvacina;
	}
	public void setvalorvacina(int valorvacina) {
		this.valorvacina = valorvacina;
	}
	public int gettipovacina() {
		return tipovacina;
	}

	public void settipovacina(int tipovacina) {
		this.tipovacina = tipovacina;
	}
	
}
