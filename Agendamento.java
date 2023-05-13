package A3;

import java.sql.Date;

public class Agendamento {

	private Date data;
	private Date horario;
	private String tipoAgend;
	
	Agendamento(){
	}
	Agendamento (Date data, Date horario, String tipoAgend, double valor, double valortosa, double tipotosa) {
		this.data = data;
		this.horario = horario;
		this.tipoAgend = tipoAgend;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getHorario() {
		return horario;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	
	public Date gettipoAgend() {
		return horario;
	}
	public void settipoAgend(String tipoAgend) {
		this.tipoAgend = tipoAgend;
	}
	
	
}