public class Vacina extends AgendamentoVeterinario {

	private String tipovacina;
	
	Vacina (String tipovacina, String tipoconsulta) {
		super(tipoconsulta, tipoconsulta);
		this.tipovacina= tipovacina;
	}

	public String getTipo() {
		return tipovacina;
	}

	public void setTipo(String tipovacina) {
		this.tipovacina = tipovacina;
	}
	
	
}
