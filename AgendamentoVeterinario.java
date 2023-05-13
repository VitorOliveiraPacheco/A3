package A3;

public class AgendamentoVeterinario {
	private String tipoconsulta; //tipo: consulta "preventiva" ou de vacinação
	private String diavet;
	
	AgendamentoVeterinario(String tipoconsulta, String diavet, String tipovacina){
		this.tipoconsulta= tipoconsulta;
		this.diavet= diavet;
	}

	public AgendamentoVeterinario() {
	}

	public String getTipoconsulta() {
		return tipoconsulta;
	}

	public void setTipoconsulta(String tipoconsulta) {
		this.tipoconsulta = tipoconsulta;
	}
	public String getdiavet() {
		return diavet;
	}

	public void setdiavet(String diavet) {
		this.diavet = diavet;
	}
	
}
