package A3;

public class AgendamentoBanho extends Agendamento {

	private double valor;
	private String diabanho;

	AgendamentoBanho(){
	}
	AgendamentoBanho(double valor, double valortosa, double tipotosa, String diabanho){
		this.valor=valor;
		this.diabanho= diabanho;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getdiabanho() {
		return diabanho;
	}
	public void setdiabanho(String diabanho) {
		this.diabanho = diabanho;
	}
	
}
