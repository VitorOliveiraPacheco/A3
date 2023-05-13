package A3;

public class AgendamentoTosa extends AgendamentoBanho {

	private double valortosa;
	private String tipoTosa;
	
	AgendamentoTosa (double valortosa, double tipotosa) {
		this.valortosa = valortosa;
		this.tipoTosa = tipoTosa;
	}

	public double getValortosa() {
		return valortosa;
	}

	public void setValortosa(double valortosa) {
		this.valortosa = valortosa;
	}

	public String getTipoTosa() {
		return tipoTosa;
	}

	public void setTipoTosa(String tipoTosa) {
		this.tipoTosa = tipoTosa;
	}
	
}
