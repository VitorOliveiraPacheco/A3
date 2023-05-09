import java.sql.Date;

public class Agendamento {

	private Date data;
	private Date horario;
	
	Agendamento (Date data, Date horario) {
		this.data = data;
		this.horario = horario;
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
	
	
}

