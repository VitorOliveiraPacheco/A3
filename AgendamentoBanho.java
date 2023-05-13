package A3;

public class AgendamentoBanho extends Agendamento {

	private double valor;

	AgendamentoBanho(){
	}
	AgendamentoBanho(double valor, double valortosa, double tipotosa){
		this.valor=valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}