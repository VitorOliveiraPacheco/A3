public class AgendamentoTosa extends AgendamentoBanho {

	private Double valor;
	private String tipoTosa;
	
	AgendamentoTosa (Double valor, String tipoTosa) {
		this.valor = valor;
		this.tipoTosa = tipoTosa;
	
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getTipoTosa() {
		return tipoTosa;
	}

	public void setTipoTosa(String tipoTosa) {
		this.tipoTosa = tipoTosa;
	}
	
	
}

