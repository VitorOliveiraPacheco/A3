package A3;

public class AgendamentoVeterinario {
	private int tipoconsulta;
	private String diavet;
	
	AgendamentoVeterinario(){
	}
	AgendamentoVeterinario(int tipoconsulta, String diavet, int tipovacina){
		this.tipoconsulta= tipoconsulta;
		this.diavet= diavet;
	}

	public int getTipoconsulta() {
		return tipoconsulta;
	}
	public void setTipoconsulta(int tipoconsulta) {
		this.tipoconsulta = tipoconsulta;
	}
	public String getdiavet() {
		return diavet;
	}
	public void setdiavet(String diavet) {
		this.diavet = diavet;
	}
}
