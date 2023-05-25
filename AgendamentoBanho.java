package A3;

public class AgendamentoBanho extends Agendamento {

	private int valor = 40;
	private String diabanho;

	AgendamentoBanho(){
	}
	AgendamentoBanho(int valor, String diabanho){
		this.valor=valor;
		this.diabanho= diabanho;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getdiabanho() {
		return diabanho;
	}
	public void setdiabanho(String diabanho) {
		this.diabanho = diabanho;
	}
}
