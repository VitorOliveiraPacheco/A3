package A3;

public class AgendamentoTosa extends AgendamentoBanho {

	private int valortosa;
	private String tosa;
	
	AgendamentoTosa (int valortosa, String tosa) {
		this.valortosa = valortosa;
		this.tosa = tosa;
	}
	public int getvalortosa() {
		return valortosa;
	}
	public void setvalortosa(int valortosa) {
		this.valortosa = valortosa;
	}
	public String gettosa() {
		return tosa;
	}
	public void settosa(String tosa) {
		this.tosa = tosa;
	}
}
