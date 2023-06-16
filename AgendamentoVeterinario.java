package A3;

public class AgendamentoVeterinario {
	
	private int valorconsulta;
	private String diavet;
	private String horavet;
	
	AgendamentoVeterinario(){
	}
	AgendamentoVeterinario(int valorconsulta, String diavet, String horavet){
		this.valorconsulta= valorconsulta;
		this.diavet= diavet;
		this.horavet= horavet;
	}

	public int getvalorconsulta() {
		return valorconsulta;
	}
	public void setvalorconsulta(int valorconsulta) {
		this.valorconsulta = valorconsulta;
	}
	public String getdiavet() {
		return diavet;
	}
	public void setdiavet(String diavet) {
		this.diavet = diavet;
	}
	public String gethoravet() {
		return horavet;
	}
	public void sethoravet(String horavet) {
		this.horavet = horavet;
	}
}
