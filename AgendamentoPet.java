package A3;

public class AgendamentoPet {

	private int valor;
	private String diabanho;
	private String horabanho;

	AgendamentoPet(){
	}
	AgendamentoPet(int valor, String diabanho, String horabanho){
		this.valor=valor;
		this.diabanho= diabanho;
		this.horabanho= horabanho;
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
	public String gethorabanho() {
		return horabanho;
	}
	public void sethorabanho(String horabanho) {
		this.horabanho = horabanho;
	}
}
