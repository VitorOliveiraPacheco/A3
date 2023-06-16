package A3;

public class AgendamentoTosa extends AgendamentoPet {

	private String valortosa = "";
	
	AgendamentoTosa(){
	}
	AgendamentoTosa (String valortosa, String tosa) {
		this.valortosa = valortosa;
	}
	public String getvalortosa() {
		return valortosa;
	}
	public void setvalortosa(String string) {
		this.valortosa = string;
	}
}
